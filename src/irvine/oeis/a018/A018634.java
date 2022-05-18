package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018634 Divisors of 765.
 * @author Sean A. Irvine
 */
public class A018634 extends FiniteSequence {

  /** Construct the sequence. */
  public A018634() {
    super(Jaguar.factor(765).divisorsSorted());
  }
}
