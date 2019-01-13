package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a034.A034824;
import irvine.oeis.a034.A034825;

/**
 * A000429.
 * @author Sean A. Irvine
 */
public class A000429 extends A034825 {

  private final A034824 mA = new A034824();
  {
    // skip one entry
    super.next();
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
