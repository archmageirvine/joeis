package irvine.oeis.a046;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A046168 Number of minimal covers on n objects with 8 members.
 * @author Sean A. Irvine
 */
public class A046168 extends GeneratingFunctionSequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  static Polynomial<Z> denominator(final int k) {
    Polynomial<Z> d = RING.one();
    final int sk = 1 << k;
    for (int j = sk - k - 1; j < sk; ++j) {
      d = RING.multiply(d, RING.oneMinusXToTheN(Z.valueOf(j), 1));
    }
    return d;
  }

  protected A046168(final int members) {
    super(RING.monomial(Z.ONE, members), denominator(members));
    next(); // skip 0th
  }

  /** Construct the sequence. */
  public A046168() {
    this(8);
  }

}
