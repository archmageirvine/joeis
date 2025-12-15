package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a006.A006450;

/**
 * A391116 Prime-indexed primes that are the average of the preceding and following prime-indexed primes.
 * @author Sean A. Irvine
 */
public class A391116 extends A006450 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mA.multiply2().equals(t.add(mB))) {
        return mA;
      }
    }
  }
}

