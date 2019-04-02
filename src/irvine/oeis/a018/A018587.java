package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018587 Divisors of 676.
 * @author Sean A. Irvine
 */
public class A018587 extends FiniteSequence {

  /** Construct the sequence. */
  public A018587() {
    super(Cheetah.factor(676).divisorsSorted());
  }
}
