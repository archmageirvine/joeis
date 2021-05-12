package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A047078 Primes at which difference pattern X2Y (X and Y &gt;= 6) occurs in A001223.
 * @author Sean A. Irvine
 */
public class A047078 extends A000040 {

  private Z mP = super.next();
  private Z mQ = super.next();
  private Z mR = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP;
      mP = mQ;
      mQ = mR;
      mR = super.next();
      if (mQ.subtract(mP).equals(Z.TWO) && mP.subtract(p).compareTo(Z.SIX) >= 0 && mR.subtract(mQ).compareTo(Z.SIX) >= 0) {
        return mP;
      }
    }
  }
}
