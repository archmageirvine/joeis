package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018717 Divisors of 910.
 * @author Sean A. Irvine
 */
public class A018717 extends FiniteSequence {

  /** Construct the sequence. */
  public A018717() {
    super(Jaguar.factor(910).divisorsSorted());
  }
}
