package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000121 Number of representations of n as a sum of Fibonacci numbers (1 is allowed twice as a part).
 * @author Sean A. Irvine
 */
public class A000121 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final A000045 fib = new A000045();
    fib.next();
    Polynomial<Z> a = RING.one();
    int f;
    while ((f = fib.next().intValue()) <= mN) {
      a = RING.multiply(a, RING.onePlusXToTheN(f), mN);
    }
    return a.coeff(mN);
  }
}

