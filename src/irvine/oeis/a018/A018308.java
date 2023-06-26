package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018308 Divisors of 154.
 * @author Sean A. Irvine
 */
public class A018308 extends FiniteSequence {

  /** Construct the sequence. */
  public A018308() {
    super(1, FINITE, Jaguar.factor(154).divisorsSorted());
  }
}
