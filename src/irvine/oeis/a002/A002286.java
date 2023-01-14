package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002286 Bisection of A002470.
 * @author Sean A. Irvine
 */
public class A002286 extends A002470 {

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
