package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018691 Divisors of 867.
 * @author Sean A. Irvine
 */
public class A018691 extends FiniteSequence {

  /** Construct the sequence. */
  public A018691() {
    super(Jaguar.factor(867).divisorsSorted());
  }
}
