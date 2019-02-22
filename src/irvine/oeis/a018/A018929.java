package irvine.oeis.a018;

import irvine.math.z.Z;

/**
 * A018929.
 * @author Sean A. Irvine
 */
public class A018929 extends A018928 {

  private A018930 mA = new A018930();
  {
    next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().square().subtract(mA.next().square());
  }
}

