package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A053492 REVEGF transform of [1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ...].
 * @author Sean A. Irvine
 */
public class A053492 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A053492(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A053492() {
    super(1);
  }

  protected int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      f = f.multiply(k);
      s = s.add(f.multiply(Functions.STIRLING2.z(mN - 1, k)).multiply(Binomial.binomial(mN + k - 1, mN - 1)));
    }
    return s;
  }
}
