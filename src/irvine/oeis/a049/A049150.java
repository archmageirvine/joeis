package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.recur.PaddingSequence;

/**
 * A049150 Recip transform of 2*(1 + x^2)-1/(1-x).
 * Sign diagram of generating sequence: +-+------------...
 * @author Georg Fischer
 */
public class A049150 extends PolynomialFieldSequence {

  /**
   * Construct the sequence.
   */
  public A049150() {
    this(0, new long[] {+1, -1, +1, -1}, new long[] {-1});
  }

  /**
   * Generic constructor with parameters.
   * @param left initial terms
   * @param right repeated terms that are overlaid by the initial terms
   */
  public A049150(final long[] left, final long[] right) {
    this(0, left, right);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param left initial terms
   * @param right repeated terms that are overlaid by the initial terms
   */
  public A049150(final int offset, final long[] left, final long[] right) {
    super(offset, "[1]", "x,B,<1,rev" + (offset == 0 ? ",>1" : ""), 1, 0, 1, 1, new PaddingSequence(left, right));
  }

  @Override
  public Z next() {
    return super.next();
  }
}
