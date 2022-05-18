package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018285 Divisors of 104.
 * @author Sean A. Irvine
 */
public class A018285 extends FiniteSequence {

  /** Construct the sequence. */
  public A018285() {
    super(Jaguar.factor(104).divisorsSorted());
  }
}
