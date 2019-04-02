package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018656 Divisors of 805.
 * @author Sean A. Irvine
 */
public class A018656 extends FiniteSequence {

  /** Construct the sequence. */
  public A018656() {
    super(Cheetah.factor(805).divisorsSorted());
  }
}
