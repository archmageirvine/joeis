package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036763 Numbers n such that x*d(n) = n has no solution for x, where d (A000005) is number of divisors; sequence gives impossible n/d(n) quotients in order of magnitude.
 * @author Sean A. Irvine
 */
public class A036763 implements Sequence {

  private Z mN = Z.valueOf(17);

  @Override
  public Z next() {
    outer:
    while (true) {
      mN = mN.add(1);
      if (mN.mod(9) == 0 && mN.divide(9).isProbablePrime()) {
        return mN; // Jianing Song, Nov 25 2018
      }
      final Z lim = mN.square().multiply(4);
      for (Z k = Z.ONE; k.compareTo(lim) <= 0; k = k.add(1)) {
        final Z p = mN.multiply(k);
        if (p.equals(mN.multiply(Cheetah.factor(p).sigma0()))) {
          continue outer;
        }
      }
      return mN;
    }
  }
}
