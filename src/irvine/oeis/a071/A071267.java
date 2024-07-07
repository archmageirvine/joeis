package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071267 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 1;

  private int[] toIntArray(final long n) {
    final String s = String.valueOf(n);
    final int[] r = new int[s.length()];
    for (int k = 0; k < r.length; ++k) {
      r[k] = s.charAt(k) - '0';
    }
    return r;
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first() >= mN) {
      final Permutation perm = new Permutation(toIntArray(mN));
      long sum = 0;
      int[] p;
      while ((p = perm.next()) != null) {
        sum += Permutation.permToZ(p).longValueExact();
      }
      mA.add(sum);
      ++mN;
    }
    return Z.valueOf(mA.pollFirst());
  }
}

