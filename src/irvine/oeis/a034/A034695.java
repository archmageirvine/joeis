package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034695 Tau_6 (the 6th Piltz divisor function), the number of ordered 6-factorizations of n; Dirichlet convolution of number-of-divisors function (A000005) with A007426.
 * @author Georg Fischer
 */
public class A034695 extends Sequence1 {

  private long mN = 0;
  protected int mOrd;

  /** Construct the sequence. */
  public A034695() {
    this(6);
  }

  /**
   * Generic constructor with parameters
   * @param ord
   */
  public A034695(final int ord) {
    mOrd = ord - 1;
  }

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      prod = prod.multiply(Binomial.binomial(e + mOrd, e));
    }
    return prod;
  }
}
