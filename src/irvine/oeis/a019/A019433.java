package irvine.oeis.a019;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a161.A161019;

/**
 * A019433 Continued fraction for tan(1/10).
 * @author Sean A. Irvine
 */
public class A019433 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019433() {
    super(new A161019());
  }
}
