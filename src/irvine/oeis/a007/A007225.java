package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007225 Number of distinct perforation patterns for deriving (v,b)=(n+4,n) punctured convolutional codes from <code>(2,1)</code>.
 * @author Sean A. Irvine
 */
public class A007225 extends A007223 {

  private int mN = 4;

  @Override
  public Z next() {
    return get(++mN, 2).coeff(mN + 4);
  }
}
