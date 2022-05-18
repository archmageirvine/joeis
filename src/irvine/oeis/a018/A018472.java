package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018472 Divisors of 470.
 * @author Sean A. Irvine
 */
public class A018472 extends FiniteSequence {

  /** Construct the sequence. */
  public A018472() {
    super(Jaguar.factor(470).divisorsSorted());
  }
}
