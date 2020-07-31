package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007227 Number of distinct perforation patterns for deriving <code>(v,b) = (n+2,n)</code> punctured convolutional codes from <code>(3,1)</code>.
 * @author Sean A. Irvine
 */
public class A007227 extends A007223 {

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, 3).coeff(mN + 2);
  }
}
