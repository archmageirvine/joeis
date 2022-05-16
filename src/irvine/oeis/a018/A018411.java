package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018411 Divisors of 357.
 * @author Sean A. Irvine
 */
public class A018411 extends FiniteSequence {

  /** Construct the sequence. */
  public A018411() {
    super(Jaguar.factor(357).divisorsSorted());
  }
}
