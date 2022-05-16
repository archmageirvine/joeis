package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018729 Divisors of 932.
 * @author Sean A. Irvine
 */
public class A018729 extends FiniteSequence {

  /** Construct the sequence. */
  public A018729() {
    super(Jaguar.factor(932).divisorsSorted());
  }
}
