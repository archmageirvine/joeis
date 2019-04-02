package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018504 Divisors of 531.
 * @author Sean A. Irvine
 */
public class A018504 extends FiniteSequence {

  /** Construct the sequence. */
  public A018504() {
    super(Cheetah.factor(531).divisorsSorted());
  }
}
