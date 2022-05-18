package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018491 Divisors of 506.
 * @author Sean A. Irvine
 */
public class A018491 extends FiniteSequence {

  /** Construct the sequence. */
  public A018491() {
    super(Jaguar.factor(506).divisorsSorted());
  }
}
