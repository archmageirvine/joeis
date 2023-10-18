package irvine.oeis.a181;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A181819 Prime shadow of n: a(1) = 1; for n&gt;1, if n = Product prime(i)^e(i), then a(n) = Product prime(e(i)).
 * @author Georg Fischer
 */
public class A181819 extends AbstractSequence implements DirectSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A181819() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Puma.prime(fs.getExponent(p)));
    }
    return prod;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Puma.prime(fs.getExponent(p)));
    }
    return prod;
  }

}
