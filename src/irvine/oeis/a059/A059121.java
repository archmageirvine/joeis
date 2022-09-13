package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A059121 Smallest sets of 4 consecutive palindromic primes (palprimes) in arithmetic progression. The initial palindromic prime of each set is listed.
 * @author Sean A. Irvine
 */
public class A059121 extends A002385 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = mC;
      mC = super.next();
      final Z d = mA.subtract(t);
      if (d.equals(mB.subtract(mA)) && d.equals(mC.subtract(mB))) {
        return t;
      }
    }
  }
}
