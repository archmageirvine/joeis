package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018647 Divisors of 788.
 * @author Sean A. Irvine
 */
public class A018647 extends FiniteSequence {

  /** Construct the sequence. */
  public A018647() {
    super(Jaguar.factor(788).divisorsSorted());
  }
}
