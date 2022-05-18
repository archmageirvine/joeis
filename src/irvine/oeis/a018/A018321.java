package irvine.oeis.a018;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FiniteSequence;

/**
 * A018321 Divisors of 180.
 * @author Sean A. Irvine
 */
public class A018321 extends FiniteSequence {

  /** Construct the sequence. */
  public A018321() {
    super(Jaguar.factor(180).divisorsSorted());
  }
}
