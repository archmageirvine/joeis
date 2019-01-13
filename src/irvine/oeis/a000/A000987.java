package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000987.
 * @author Sean A. Irvine
 */
public class A000987 extends A000985 {

  private Z mA = null;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      mA =  Z.valueOf(mN);
    } else {
      mA = mA.multiply(mN - 2).add(super.next());
    }
    return mA;
  }
}

