package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018722 Divisors of 920.
 * @author Sean A. Irvine
 */
public class A018722 extends FiniteSequence {

  /** Construct the sequence. */
  public A018722() {
    super(Jaguar.factor(920).divisorsSorted());
  }
}
