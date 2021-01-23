package irvine.oeis.a253;

import irvine.math.z.Z;
import irvine.oeis.a002.A002033;

/**
 * A253249 Number of nonempty chains in the divides relation on the divisors of n.
 * @author Georg Fischer
 */
public class A253249 extends A002033 {

  private int mN = 0;

  /**
   * Construct the sequence
   */
  public A253249() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(mN == 1 ? Z.TWO : Z.FOUR).subtract(Z.ONE);
  }
}
