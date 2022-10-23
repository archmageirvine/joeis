package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007547 Number of steps to compute n-th prime in PRIMEGAME (slow version).
 * @author Sean A. Irvine
 */
public class A007547 extends Sequence1 {

  private Z mA = Z.ZERO;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    long m = 1;
    while (true) {
      mP = A007542.conwayPrimeGame(mP);
      if (mP.and(mP.subtract(1)).signum() == 0) {
        break;
      }
      ++m;
    }
    mA = mA.add(m);
    return mA;
  }
}
