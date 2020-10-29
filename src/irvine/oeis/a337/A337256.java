package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.oeis.a002.A002033;

/**
 * A337256 Number of strict chains of divisors of n.
 * @author Georg Fischer
 */
public class A337256 extends A002033 {

  private int mN = 0;

  /**
   * Construct the sequence
   */
  public A337256() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(mN == 1 ? Z.TWO : Z.FOUR);
  }
}
