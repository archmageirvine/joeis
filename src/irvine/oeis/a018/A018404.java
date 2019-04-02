package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018404 Divisors of 345.
 * @author Sean A. Irvine
 */
public class A018404 extends FiniteSequence {

  /** Construct the sequence. */
  public A018404() {
    super(Cheetah.factor(345).divisorsSorted());
  }
}
