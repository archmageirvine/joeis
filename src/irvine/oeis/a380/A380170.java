package irvine.oeis.a380;

import irvine.math.z.Z;
import irvine.oeis.a001.A001664;

/**
 * A380170 Coefficient [k^1] of Wynn's converging polynomial p_n(k) of Weber functions.
 * @author Sean A. Irvine
 */
public class A380170 extends A001664 {

  private int mN = 0;

  /** Construct the sequence. */
  public A380170() {
    super(1);
  }

  @Override
  public Z next() {
    return mB.get(++mN, 1);
  }
}
