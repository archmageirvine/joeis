package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028340 Coefficient of <code>x^3</code> in expansion of <code>(x+1)*(x+3)*...*(x+2*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A028340 extends A028338 {

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN, 3);
  }
}
