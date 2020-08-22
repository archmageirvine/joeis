package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028341 Coefficient of x^4 in expansion of (x+1)*(x+3)*...*(x+2*n-1).
 * @author Sean A. Irvine
 */
public class A028341 extends A028338 {

  private int mN = 3;

  @Override
  public Z next() {
    return get(++mN, 4);
  }
}
