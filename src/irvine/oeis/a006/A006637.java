package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A006637 Expansion of (2 - x)^4/(1 - x)^8.
 * @author Sean A. Irvine
 */
public class A006637 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A006637() {
    super(RING.pow(Polynomial.create(2, -1), 4), RING.pow(Polynomial.create(-1, 1), 8));
  }
}
