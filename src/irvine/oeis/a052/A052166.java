package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052166 Primes at which the difference pattern X424Y (X and Y &gt;= 6) occurs in A001223.
 * @author Sean A. Irvine
 */
public class A052166 extends A000040 {

  private Z mP = super.next();
  private Z mQ = super.next();
  private Z mR = super.next();
  private Z mS = super.next();
  private Z mT = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP;
      mP = mQ;
      mQ = mR;
      mR = mS;
      mS = mT;
      mT = super.next();
      if (mQ.subtract(mP).equals(Z.FOUR)
        && mR.subtract(mQ).equals(Z.TWO)
        && mS.subtract(mR).equals(Z.FOUR)
        && mP.subtract(p).compareTo(Z.SIX) >= 0
        && mT.subtract(mS).compareTo(Z.SIX) >= 0) {
        return mP;
      }
    }
  }
}
