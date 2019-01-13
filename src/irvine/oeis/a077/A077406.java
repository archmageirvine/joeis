package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077406.
 * @author Sean A. Irvine
 */
public class A077406 extends A077407 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mN);
  }
}


