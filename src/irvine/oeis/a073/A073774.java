package irvine.oeis.a073;

import irvine.math.z.Z;

/**
 * A073774 Number of plane binary trees of size n+3 and height n.
 * @author Sean A. Irvine
 */
public class A073774 extends A073345 {

  private int mN = -1;

  @Override
  public Z next() {
    return mB.get(++mN, mN + 3);
  }
}
