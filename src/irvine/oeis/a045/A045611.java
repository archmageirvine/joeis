package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045611 Number of different energy states of n positive and n negative charges on a necklace. Different sets of distances between n points chosen from 2n equally spaced points on a circle.
 * @author Sean A. Irvine
 */
public class A045611 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final TreeSet<Q> energy = new TreeSet<>();
    final TreeSet<Long> distances = new TreeSet<>();
    final int charges = 2 * mN;
    final long limit = 1L << charges;
    for (long state = (1L << mN) - 1; state < limit; state = LongUtils.swizzle(state)) {
      Q sum = Q.ZERO;
      long d = 0;
      for (int k = 0; k < charges; ++k) {
        Q s = Q.ZERO;
        for (int j = 0; j < charges; ++j) {
          if (k != j) {
            final int delta = Math.abs(k - j);
            s = s.signedAdd((state & (1L << j)) == 0, new Q(1, Math.min(delta, charges - delta)));
            if (((state & (1L << j))) == 0 && ((state & (1L << k)) == 0)) {
              //d |= 1L << Math.min(delta, charges - delta);
              d |= 1L << delta;
            }
          }
        }
        sum = sum.signedAdd((state & (1L << k)) == 0, s);
      }
      distances.add(d);
//      final String s = "00000000000000000000" + Long.toBinaryString(state);
//      System.out.println("state=" + s.substring(s.length() - charges) + " U=" + sum);
      energy.add(sum);
    }
    System.out.println("D=" + distances.size() + " " + distances);
    return Z.valueOf(energy.size());
  }
}
