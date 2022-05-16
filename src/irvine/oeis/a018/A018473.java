package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018473 Divisors of 472.
 * @author Sean A. Irvine
 */
public class A018473 extends FiniteSequence {

  /** Construct the sequence. */
  public A018473() {
    super(Jaguar.factor(472).divisorsSorted());
  }
}
