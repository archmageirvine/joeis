package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.GeneratingFunctionSequence;

/**
 * A001874 Convolved Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A001874 extends GeneratingFunctionSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A001874() {
    super(RING.one(), RING.pow(Polynomial.create(1, -1, -1), 6));
  }
}
