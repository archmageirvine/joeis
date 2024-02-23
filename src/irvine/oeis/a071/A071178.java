package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A071178 Exponent of the largest prime factor of n.
 * @author Georg Fischer
 */
public class A071178 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A071178() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return Z.valueOf(fs.getExponent(fs.largestPrimeFactor()));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}
