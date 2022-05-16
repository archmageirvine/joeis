package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018769 Divisors of 1002.
 * @author Sean A. Irvine
 */
public class A018769 extends FiniteSequence {

  /** Construct the sequence. */
  public A018769() {
    super(Jaguar.factor(1002).divisorsSorted());
  }
}
