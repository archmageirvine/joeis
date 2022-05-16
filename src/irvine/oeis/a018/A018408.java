package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018408 Divisors of 352.
 * @author Sean A. Irvine
 */
public class A018408 extends FiniteSequence {

  /** Construct the sequence. */
  public A018408() {
    super(Jaguar.factor(352).divisorsSorted());
  }
}
