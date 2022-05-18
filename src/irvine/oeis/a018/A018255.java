package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018255 Divisors of 30.
 * @author Sean A. Irvine
 */
public class A018255 extends FiniteSequence {

  /** Construct the sequence. */
  public A018255() {
    super(Jaguar.factor(30).divisorsSorted());
  }
}

