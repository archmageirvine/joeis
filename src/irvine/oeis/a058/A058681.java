package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A058681.
 * @author Sean A. Irvine
 */
public class A058681 extends A000110 {

  {
    super.next();
    super.next();
    super.next();
  }

  private Z mA = Z.TWO;

  @Override
  public Z next() {
    mA = mA.multiply2();
    return super.next().subtract(mA);
  }
}
