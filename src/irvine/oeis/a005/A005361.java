package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A005361 Product of exponents of prime factorization of n.
 * @author Sean A. Irvine
 */
public class A005361 extends AbstractSequence implements DirectSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A005361() {
    super(1);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(fs.getExponent(p));
    }
    return prod;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(fs.getExponent(p));
    }
    return prod;
  }

}
