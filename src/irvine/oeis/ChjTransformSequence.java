package irvine.oeis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;

/**
 * CHJ transform.
 * @author Sean A. Irvine
 */
public class ChjTransformSequence implements Sequence {

  // See https://oeis.org/transforms2.html (but beware errors)

  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();
  private final MemorySequence mA;

  protected ChjTransformSequence(final Sequence seq) {
    // The mA sequence will be numbered from 0
    mA = MemorySequence.cachedSequence(seq);
    mA.next();
  }

  private static boolean isDivisor(final int[] q, final int d) {
    for (final int qi : q) {
      if (qi % d != 0) {
        return false;
      }
    }
    return true;
  }

  private static Z t(final List<Z> a, final int n) {
    final IntegerPartition part = new IntegerPartition(n);
    Z sum = Z.ZERO;
    int[] p;
    final int[] q = new int[n + 1];
    while ((p = part.next()) != null) {
      final int k = p.length; // number of parts
      IntegerPartition.toCountForm(p, q);
      Z t2 = Z.ZERO;
      for (int d = 1; d < IntegerUtils.max(q); ++d) {
        if (isDivisor(q, d)) {
          System.out.println("Accepted divisor " + d);
          final int mu = Mobius.mobius(d);
          if (mu != 0) {
            Z u = FACTORIAL.factorial(k / d);
            for (int i = 1; i < q.length; ++i) {
              if (q[i] != 0) {
                u = u.multiply(a.get(i - 1).pow(q[i] / d));
                u = u.divide(FACTORIAL.factorial(q[i] / d));
              }
            }
            //System.out.println(u + "/" + v);
            t2 = t2.signedAdd(mu == 1, u);
          }
        }
      }
      t2 = t2.multiply(FACTORIAL.factorial(n));
      for (int i = 1; i < q.length; ++i) {
        if (q[i] != 0) {
          t2 = t2.divide(FACTORIAL.factorial(i).pow(q[i]));
        }
      }
      sum = sum.add(t2.divide(k));
    }
    return sum;
  }

  /**
   * Compute the CHJ transform of the given list.
   * @param a list
   * @return CHJ transform
   */
  public static List<Z> chj(final List<Z> a) {
    final ArrayList<Z> res = new ArrayList<>(a.size());
    for (int k = 1; k <= a.size(); ++k) {
      res.add(t(a, k));
    }
    //System.out.println(res);
    return res;
  }

  private int mN = -1;

  @Override
  public Z next() {
    mA.next(); // ensure sufficient terms in underlying sequence
    return chj(mA).get(++mN);
  }

  /**
   * Apply the CHJ transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final Sequence seq = new ChjTransformSequence(new ReaderSequence(r));
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
