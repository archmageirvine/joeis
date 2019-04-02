package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018570 Divisors of 648.
 * @author Sean A. Irvine
 */
public class A018570 extends FiniteSequence {

  /** Construct the sequence. */
  public A018570() {
    super(Cheetah.factor(648).divisorsSorted());
  }
}
