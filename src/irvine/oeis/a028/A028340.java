package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028340 Coefficient of x^3 in expansion of (x+1)*(x+3)*...*(x+2*n-1).
 * @author Sean A. Irvine
 */
public class A028340 extends A028338 {

  /** Construct the sequence. */
  public A028340() {
    super(3);
  }

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN, 3);
  }
}
