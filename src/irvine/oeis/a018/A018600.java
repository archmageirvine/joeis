package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018600 Divisors of 704.
 * @author Sean A. Irvine
 */
public class A018600 extends FiniteSequence {

  /** Construct the sequence. */
  public A018600() {
    super(Cheetah.factor(704).divisorsSorted());
  }
}
