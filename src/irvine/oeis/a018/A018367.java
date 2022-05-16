package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018367 Divisors of 273.
 * @author Sean A. Irvine
 */
public class A018367 extends FiniteSequence {

  /** Construct the sequence. */
  public A018367() {
    super(Jaguar.factor(273).divisorsSorted());
  }
}
