package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037259 Second differences of A037257.
 * @author Sean A. Irvine
 */
public class A037259 extends A037258 {

  @Override
  public Z next() {
    super.next();
    return a2(mN);
  }
}

