package irvine.oeis.a014;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A014697 Poincar\u00e9 series [or Poincare series] (or Molien series) for mod 2 cohomology of universal W-group W(4).
 * @author Sean A. Irvine
 */
public class A014697 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A014697() {
    super(Polynomial.create(1, 4, 20, 56, 84, 90, 84, 56, 20, 4, 1), RING.pow(RING.oneMinusXToTheN(2), 10));
  }
}

