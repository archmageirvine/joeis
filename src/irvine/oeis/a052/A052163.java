package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052163 Primes at which the difference pattern X24Y (X and Y &gt;= 6) occurs in A001223.
 * @author Sean A. Irvine
 */
public class A052163 extends A000040 {

  private Z mP = super.next();
  private Z mQ = super.next();
  private Z mR = super.next();
  private Z mS = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP;
      mP = mQ;
      mQ = mR;
      mR = mS;
      mS = super.next();
      if (mQ.subtract(mP).equals(Z.TWO) && mR.subtract(mQ).equals(Z.FOUR) && mP.subtract(p).compareTo(Z.SIX) >= 0 && mS.subtract(mR).compareTo(Z.SIX) >= 0) {
        return mP;
      }
    }
  }
}
