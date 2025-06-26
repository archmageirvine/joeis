package irvine.oeis.a138;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectPredicate;

/**
 * A138302 Exponentially 2^n-numbers: 1 together with positive integers k such that all exponents in prime factorization of k are powers of 2.
 * @author Georg Fischer
 */
public class A138302 extends AbstractSequence implements DirectPredicate {

  private int mN;

  /** Construct the sequence. */
  public A138302() {
    super(1);
    mN = 0;
  }

  @Override
  public boolean is(final Z n) {
    if (n.equals(Z.ONE)) {
      return true;
    }
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (Integer.bitCount(fs.getExponent(p)) != 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean is(final int n) {
    return is(Z.valueOf(n));
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
