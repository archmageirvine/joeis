package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A059120 Smallest sets of 3 consecutive palindromic primes (palprimes) in arithmetic progression. The first prime of each set is listed.
 * @author Sean A. Irvine
 */
public class A059120 extends A002385 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (mA.subtract(t).equals(mB.subtract(mA))) {
        return t;
      }
    }
  }
}
