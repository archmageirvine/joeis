package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018460 Divisors of 444.
 * @author Sean A. Irvine
 */
public class A018460 extends FiniteSequence {

  /** Construct the sequence. */
  public A018460() {
    super(Jaguar.factor(444).divisorsSorted());
  }
}
