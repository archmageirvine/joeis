package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028339 Coefficient of x^2 in expansion of (x+1)*(x+3)*...*(x+2*n-1).
 * @author Sean A. Irvine
 */
public class A028339 extends A028338 {

  /** Construct the sequence. */
  public A028339() {
    super(2);
  }

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2);
  }
}
