package irvine.oeis.a008;

import java.util.Arrays;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;
import irvine.util.string.StringUtils;

/**
 * A008284.
 * @author Sean A. Irvine
 */
public class A008284 extends MemoryFunction2<Long, Z> implements Sequence {

  @Override
  protected Z compute(final Long n, final Long k) {
    return get(n - 1, k - 1).add(get(n - k, k));
  }

  @Override
  public Z get(final Long n, final Long k) {
    if (k == 1 || n.equals(k)) {
      return Z.ONE;
    }
    if (k > n) {
      return Z.ZERO;
    }
    return super.get(n, k);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return get(mN, mM);
  }

  /**
   * Noddy.
   * @param args ignored
   */
  public static void main(final String[] args) {
    // Test conjecture of jnthn stdhr from seqfan mailing list
    int row = 0;
    final Sequence part = new A000041();
    final Sequence seq = new A008284();
    int p = 0;
    while (true) {
      ++row;
      while (row > p + 1) {
        p = part.next().multiply2().intValueExact();
      }
      final Z[] r = new Z[row];
      for (int k = 0; k < r.length; ++k) {
        r[k] = seq.next();
      }
      if (row != p && row != p + 1) {
        Arrays.sort(r);
        for (int k = 1; k < r.length; ++k) {
          if (!Z.ONE.equals(r[k]) && r[k].equals(r[k - 1])) {
            System.out.println(row + " " + r[k]);
          }
        }
      }
      if (row % 100 == 0) {
        StringUtils.message("Done: " + row);
      }
    }
  }
}

