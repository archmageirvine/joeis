package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045610 Number of different energy states of n positive and n negative charges on a string.
 * @author Sean A. Irvine
 */
public class A045610 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final TreeSet<Q> energy = new TreeSet<>();
    final int charges = 2 * mN;
    final long limit = 1L << (charges - 1); // -1 bit for symmetry
    for (long state = (1L << mN) - 1; state < limit; state = LongUtils.swizzle(state)) {
      Q sum = Q.ZERO;
      for (int k = 0; k < charges; ++k) {
        Q s = Q.ZERO;
        for (int j = k + 1; j < charges; ++j) {
          s = s.signedAdd((state & (1L << j)) == 0, new Q(1, Math.abs(k - j)));
        }
        sum = sum.signedAdd((state & (1L << k)) == 0, s);
      }
      energy.add(sum);
    }
    return Z.valueOf(energy.size());
  }
}
