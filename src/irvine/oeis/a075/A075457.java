package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075457 Integer averages of first n perfect powers for some n.
 * @author Sean A. Irvine
 */
public class A075457 extends A001597 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(super.next());
      if (mSum.mod(++mN) == 0) {
        return mSum.divide(mN);
      }
    }
  }
}
