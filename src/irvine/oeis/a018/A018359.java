package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018359 Divisors of 258.
 * @author Sean A. Irvine
 */
public class A018359 extends FiniteSequence {

  /** Construct the sequence. */
  public A018359() {
    super(Jaguar.factor(258).divisorsSorted());
  }
}
