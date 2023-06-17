package irvine.oeis.a024;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002144;

/**
 * A024941 Number of partitions of n into distinct primes of the form 4k + 1.
 * @author Sean A. Irvine
 */
public class A024941 extends AbstractSequence {

  /** Construct the sequence. */
  public A024941() {
    super(0);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = -1;

  protected Sequence seq() {
    return new A002144();
  }

  @Override
  public Z next() {
    ++mN;
    final Sequence primes = seq();
    Polynomial<Z> prod = RING.one();
    int p;
    while ((p = primes.next().intValueExact()) <= mN) {
      prod = RING.multiply(prod, p == 0 ? RING.one() : RING.onePlusXToTheN(p), mN);
    }
    return prod.coeff(mN);
  }
}
