package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018270 Divisors of 70.
 * @author Sean A. Irvine
 */
public class A018270 extends FiniteSequence {

  /** Construct the sequence. */
  public A018270() {
    super(Jaguar.factor(70).divisorsSorted());
  }
}

