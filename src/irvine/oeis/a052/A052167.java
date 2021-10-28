package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052167 Primes at which difference pattern X2424Y (X and Y &gt;= 6) occurs in A001223.
 * @author Sean A. Irvine
 */
public class A052167 extends A000040 {

  private Z mP = super.next();
  private Z mQ = super.next();
  private Z mR = super.next();
  private Z mS = super.next();
  private Z mT = super.next();
  private Z mU = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mP;
      mP = mQ;
      mQ = mR;
      mR = mS;
      mS = mT;
      mT = mU;
      mU = super.next();
      if (mQ.subtract(mP).equals(Z.TWO)
        && mR.subtract(mQ).equals(Z.FOUR)
        && mS.subtract(mR).equals(Z.TWO)
        && mT.subtract(mS).equals(Z.FOUR)
        && mP.subtract(p).compareTo(Z.SIX) >= 0
        && mU.subtract(mT).compareTo(Z.SIX) >= 0) {
        return mP;
      }
    }
  }
}
