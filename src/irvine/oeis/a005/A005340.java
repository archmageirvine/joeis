package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A005340 Number of ways in which n identical balls can be distributed among 7 boxes in a row such that each pair of adjacent boxes contains at least 4 balls.
 * @author Sean A. Irvine
 */
public class A005340 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A005340() {
    super(Polynomial.create(1, 6, 6, 1, 0, -66, 74, -21), RING.pow(Polynomial.create(1, -1), 7));
  }
}
