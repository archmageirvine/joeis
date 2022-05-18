package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018773 Divisors of 1010.
 * @author Sean A. Irvine
 */
public class A018773 extends FiniteSequence {

  /** Construct the sequence. */
  public A018773() {
    super(Jaguar.factor(1010).divisorsSorted());
  }
}
