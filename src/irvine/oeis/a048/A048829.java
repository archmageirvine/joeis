package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048829 Number of rooted identity game trees of height &lt;=n, first player to reach to reach top wins. Second player wins.
 * @author Sean A. Irvine
 */
public class A048829 extends A048830 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(super.next().longValueExact());
  }
}
