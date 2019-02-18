package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a002.A002379;

/**
 * A018886.
 * @author Sean A. Irvine
 */
public class A018886 extends A002379 {

  {
    super.next(); // skip 0th
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(mN).subtract(1);
  }
}
