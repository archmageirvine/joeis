package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037262 Second differences of A037260.
 * @author Sean A. Irvine
 */
public class A037262 extends A037261 {

  @Override
  public Z next() {
    super.next();
    return a2(mN);
  }
}

