package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001497 Triangle of coefficients of Bessel polynomials (exponents in decreasing order).
 * @author Sean A. Irvine
 */
public class A001497 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A001497(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A001497() {
    super(0);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mK = 0;

  protected Z t(final int n, final int m) {
    return Functions.FACTORIAL.z(2 * n - m)
      .shiftRight(n - m)
      .divide(Functions.FACTORIAL.z(m))
      .divide(Functions.FACTORIAL.z(n - m));
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return t(mN, mK);
  }
}
