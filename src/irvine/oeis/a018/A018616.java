package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018616 Divisors of 732.
 * @author Sean A. Irvine
 */
public class A018616 extends FiniteSequence {

  /** Construct the sequence. */
  public A018616() {
    super(Jaguar.factor(732).divisorsSorted());
  }
}
