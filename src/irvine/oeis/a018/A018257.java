package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018257 Divisors of 40.
 * @author Sean A. Irvine
 */
public class A018257 extends FiniteSequence {

  /** Construct the sequence. */
  public A018257() {
    super(Jaguar.factor(40).divisorsSorted());
  }
}

