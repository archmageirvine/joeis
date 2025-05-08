package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a007.A007908;

/**
 * A077094.
 * @author Sean A. Irvine
 */
public class A077147 extends A007908 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

