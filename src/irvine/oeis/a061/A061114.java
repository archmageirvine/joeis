package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A061114 Concatenation of first n Bell numbers (starting with A000110(1)).
 * @author Sean A. Irvine
 */
public class A061114 extends A000110 {

  private final StringBuilder mA = new StringBuilder();
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}
