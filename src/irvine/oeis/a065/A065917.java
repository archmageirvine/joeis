package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A065917 Boundaries of primorial intervals [1,3]; [3,9],[9,15]; [15,45], etc.
 * @author Sean A. Irvine
 */
public class A065917 extends A002110 {

  {
    super.next();
    setOffset(1);
  }
  private Z mA = null;
  private Z mP1 = super.next();
  private Z mP2 = super.next();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      while (mP2.divide2().compareTo(mA) <= 0) {
        mP1 = mP2;
        mP2 = super.next();
      }
      mA = mA.add(mP1);
    }
    return mA;
  }
}
