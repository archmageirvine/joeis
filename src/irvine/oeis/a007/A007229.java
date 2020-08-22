package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007229 Number of distinct perforation patterns for deriving (v,b) = (n+2,n) punctured convolutional codes from (4,1).
 * @author Sean A. Irvine
 */
public class A007229 extends A007223 {

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, 4).coeff(mN + 2);
  }
}
