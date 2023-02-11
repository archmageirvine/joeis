package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061346 Odd numbers that are neither primes nor prime powers.
 * @author Sean A. Irvine
 */
public class A061346 extends A061345 {

  private Z mA = super.next();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (mN.equals(mA)) {
        mA = super.next();
      } else {
        return mN;
      }
    }
  }
}

