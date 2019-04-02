package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007224 Number of distinct perforation patterns for deriving (v,b)=(n+3,n) punctured convolutional codes from (2,1).
 * @author Sean A. Irvine
 */
public class A007224 extends A007223 {

  private int mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2).coeff(mN + 3);
  }
}
