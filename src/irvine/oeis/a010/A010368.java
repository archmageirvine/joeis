package irvine.oeis.a010;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A010368 Number of points of L1 norm 2n in Hamming code version of E_8 lattice.
 * @author Sean A. Irvine
 */
public class A010368 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A010368() {
    super(Polynomial.create(1, 8, 252, 952, 1670, 952, 252, 8, 1), RING.pow(RING.oneMinusXToTheN(1), 8));
  }
}
