package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052162 Primes at which difference pattern X4Y (X and Y &gt;= 6) occurs in A001223.
 * @author Sean A. Irvine
 */
public class A052162 extends A000040 {

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
      if (mQ.subtract(mP).equals(Z.FOUR) && mP.subtract(p).compareTo(Z.SIX) >= 0 && mR.subtract(mQ).compareTo(Z.SIX) >= 0) {
        return mP;
      }
    }
  }
}
