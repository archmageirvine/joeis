package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018543 Divisors of 603.
 * @author Sean A. Irvine
 */
public class A018543 extends FiniteSequence {

  /** Construct the sequence. */
  public A018543() {
    super(Cheetah.factor(603).divisorsSorted());
  }
}
