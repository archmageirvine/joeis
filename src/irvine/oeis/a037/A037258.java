package irvine.oeis.a037;

import irvine.math.z.Z;

/**
 * A037258 First differences of A037257.
 * @author Sean A. Irvine
 */
public class A037258 extends A037257 {

  @Override
  public Z next() {
    super.next();
    return a1(mN);
  }
}

