package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018746 Divisors of 963.
 * @author Sean A. Irvine
 */
public class A018746 extends FiniteSequence {

  /** Construct the sequence. */
  public A018746() {
    super(Jaguar.factor(963).divisorsSorted());
  }
}
