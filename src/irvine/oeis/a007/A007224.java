package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007224 Number of distinct perforation patterns for deriving <code>(v,b) = (n+3,n)</code> punctured convolutional codes from <code>(2,1)</code>.
 * @author Sean A. Irvine
 */
public class A007224 extends A007223 {

  private int mN = 3;

  @Override
  public Z next() {
    return get(++mN, 2).coeff(mN + 3);
  }
}
