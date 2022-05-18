package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018704 Divisors of 890.
 * @author Sean A. Irvine
 */
public class A018704 extends FiniteSequence {

  /** Construct the sequence. */
  public A018704() {
    super(Jaguar.factor(890).divisorsSorted());
  }
}
