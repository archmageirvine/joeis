package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018682 Divisors of 850.
 * @author Sean A. Irvine
 */
public class A018682 extends FiniteSequence {

  /** Construct the sequence. */
  public A018682() {
    super(Jaguar.factor(850).divisorsSorted());
  }
}
