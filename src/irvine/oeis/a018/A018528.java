package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018528 Divisors of 576.
 * @author Sean A. Irvine
 */
public class A018528 extends FiniteSequence {

  /** Construct the sequence. */
  public A018528() {
    super(Jaguar.factor(576).divisorsSorted());
  }
}
