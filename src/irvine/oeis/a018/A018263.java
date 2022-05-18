package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018263 Divisors of 52.
 * @author Sean A. Irvine
 */
public class A018263 extends FiniteSequence {

  /** Construct the sequence. */
  public A018263() {
    super(Jaguar.factor(52).divisorsSorted());
  }
}

