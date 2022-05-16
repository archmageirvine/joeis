package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018676 Divisors of 840.
 * @author Sean A. Irvine
 */
public class A018676 extends FiniteSequence {

  /** Construct the sequence. */
  public A018676() {
    super(Jaguar.factor(840).divisorsSorted());
  }
}
