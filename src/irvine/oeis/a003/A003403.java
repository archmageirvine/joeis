package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A003403 G.f.: <code>(1+x^3+x^4+...+x^12+x^15)/Prod_{i=1..10} (1-x^i)</code>.
 * @author Sean A. Irvine
 */
public class A003403 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN;
  static {
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= 10; ++k) {
      den = RING.multiply(den, RING.oneMinusXToTheN(k));
    }
    DEN = den;
  }

  /** Construct the sequence. */
  public A003403() {
    super(Polynomial.create(1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1), DEN);
  }
}

