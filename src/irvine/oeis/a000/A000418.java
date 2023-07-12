package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a034.A034823;
import irvine.oeis.a034.A034824;

/**
 * A000418 Number of n-node rooted trees of height 7.
 * @author Sean A. Irvine
 */
public class A000418 extends A034824 {

  private final A034823 mA = new A034823();

  {
    setOffset(1);
    // skip one entry
    super.next();
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
