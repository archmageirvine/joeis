package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000959;

/**
 * A057698 Prime lucky numbers k (from A031157) such that nextprime(k)=nextlucky(k).
 * @author Sean A. Irvine
 */
public class A057698 extends A000959 {

  private final Fast mPrime = new Fast();
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.isProbablePrime() && mPrime.nextPrime(t).equals(mA)) {
        return t;
      }
    }
  }
}
