package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018527 Divisors of 575.
 * @author Sean A. Irvine
 */
public class A018527 extends FiniteSequence {

  /** Construct the sequence. */
  public A018527() {
    super(Cheetah.factor(575).divisorsSorted());
  }
}
