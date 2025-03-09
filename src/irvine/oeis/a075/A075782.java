package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075767.
 * @author Sean A. Irvine
 */
public class A075782 extends A001597 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.add(t).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
