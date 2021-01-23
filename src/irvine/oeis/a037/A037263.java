package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037263 Third differences of A037260.
 * @author Sean A. Irvine
 */
public class A037263 extends A037262 {

  @Override
  public Z next() {
    super.next();
    return a3(mN);
  }
}

