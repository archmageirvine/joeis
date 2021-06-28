package irvine.oeis.a169;
// manually 2021-06-24

import irvine.math.z.Z;
import irvine.oeis.a007.A007088;

/**
 * A169964 Numbers whose decimal expansion contains only 0's and 5's.
 * @author Georg Fischer
 */
public class A169964 extends A007088 {

  protected int mN;
  protected Z mDigit;

  /** Construct the sequence */
  public A169964() {
    this(0, 5);
  }

  /**
   * Generic constructor with parameter
   * @param offset offset1 of the sequence
   * @param parm digit to multiply on A007088
   */
  public A169964(final int offset, final int parm) {
    mN = offset - 1;
    mDigit = Z.valueOf(parm);
  }

  @Override
  public Z next() {
    return super.next().multiply(mDigit);
  }
}
