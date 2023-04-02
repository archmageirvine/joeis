package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062530 extends A062529 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
