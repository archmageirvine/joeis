package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018696 Divisors of 874.
 * @author Sean A. Irvine
 */
public class A018696 extends FiniteSequence {

  /** Construct the sequence. */
  public A018696() {
    super(Cheetah.factor(874).divisorsSorted());
  }
}
