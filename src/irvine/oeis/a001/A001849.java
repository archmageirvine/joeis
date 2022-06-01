package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A001849 Crystal ball sequence for 7-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A001849 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A001849() {
    super(RING.pow(Polynomial.create(1, 1), 7), RING.pow(Polynomial.create(1, -1), 8));
  }
}
