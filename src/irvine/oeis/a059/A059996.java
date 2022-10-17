package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A059996 Concatenate Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A059996 extends A000108 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}
