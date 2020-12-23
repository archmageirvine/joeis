package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037261 First differences of A037260.
 * @author Sean A. Irvine
 */
public class A037261 extends A037260 {

  @Override
  public Z next() {
    super.next();
    return a1(mN);
  }
}

