package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A059122 Smallest sets of 5 consecutive palindromic primes (palprimes) in arithmetic progression. The initial palindromic prime is listed.
 * @author Sean A. Irvine
 */
public class A059122 extends A002385 {

  private Z mA = super.next();
  private Z mB = super.next();
  private Z mC = super.next();
  private Z mD = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = mC;
      mC = mD;
      mD = super.next();
      final Z d = mA.subtract(t);
      if (d.equals(mB.subtract(mA)) && d.equals(mC.subtract(mB)) && d.equals(mD.subtract(mC))) {
        return t;
      }
    }
  }
}
