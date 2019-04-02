package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018778 Divisors of 1017.
 * @author Sean A. Irvine
 */
public class A018778 extends FiniteSequence {

  /** Construct the sequence. */
  public A018778() {
    super(Cheetah.factor(1017).divisorsSorted());
  }
}
