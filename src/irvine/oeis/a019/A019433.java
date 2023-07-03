package irvine.oeis.a019;

import irvine.oeis.a161.A161019;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A019433 Continued fraction for tan(1/10).
 * @author Sean A. Irvine
 */
public class A019433 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019433() {
    super(0, new A161019());
  }
}
