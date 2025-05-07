package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A382669 Even numbers m such that both p = m^2 + 1 and q = (p^2 + 1)/2 are primes.
 * @author Sean A. Irvine
 */
public class A382669 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      mN = 0;
      return Z.TWO;
    }
    while (true) {
      mN += 10;
      final Z p = Z.valueOf(mN).square().add(1);
      if (p.isProbablePrime()) {
        final Z q = p.square().add(1).divide2();
        if (q.isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
