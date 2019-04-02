package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018634 Divisors of 765.
 * @author Sean A. Irvine
 */
public class A018634 extends FiniteSequence {

  /** Construct the sequence. */
  public A018634() {
    super(Cheetah.factor(765).divisorsSorted());
  }
}
