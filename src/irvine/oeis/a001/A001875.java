package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A001875 Convolved Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A001875 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A001875() {
    super(RING.one(), RING.pow(Polynomial.create(1, -1, -1), 7));
  }
}
