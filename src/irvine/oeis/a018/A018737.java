package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018737 Divisors of 946.
 * @author Sean A. Irvine
 */
public class A018737 extends FiniteSequence {

  /** Construct the sequence. */
  public A018737() {
    super(Cheetah.factor(946).divisorsSorted());
  }
}
