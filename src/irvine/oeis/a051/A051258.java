package irvine.oeis.a051;

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.memory.MemorySequence;

/**
 * A051258 Fibocyclotomic numbers: numbers formed from cyclotomic polynomials and Fibonacci numbers (A000045).
 * @author Sean A. Irvine
 */
public class A051258 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A051258(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A051258() {
    super(0);
  }

  private final MemorySequence mF = MemorySequence.cachedSequence(new A000045());
  private final CyclotomicPolynomials mC = new CyclotomicPolynomials();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final Polynomial<Z> c = mC.get(mN);
    for (int k = 1; k <= c.degree(); ++k) {
      sum = sum.add(c.coeff(k).multiply(mF.a(k)));
    }
    return sum;
  }
}
