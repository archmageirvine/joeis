package irvine.oeis.a018;

import irvine.factor.factor.Cheetah;
import irvine.oeis.FiniteSequence;

/**
 * A018755 Divisors of 978.
 * @author Sean A. Irvine
 */
public class A018755 extends FiniteSequence {

  /** Construct the sequence. */
  public A018755() {
    super(Cheetah.factor(978).divisorsSorted());
  }
}
