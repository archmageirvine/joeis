package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018591 Divisors of 684.
 * @author Sean A. Irvine
 */
public class A018591 extends FiniteSequence {

  /** Construct the sequence. */
  public A018591() {
    super(1, FINITE, Jaguar.factor(684).divisorsSorted());
  }
}
