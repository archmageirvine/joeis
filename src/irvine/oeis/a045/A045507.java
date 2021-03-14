package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000079;

/**
 * A045507 Concatenate powers of 2.
 * @author Sean A. Irvine
 */
public class A045507 extends A000079 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}
