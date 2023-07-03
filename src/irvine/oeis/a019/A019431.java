package irvine.oeis.a019;

import irvine.oeis.a161.A161017;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A019431 Continued fraction for tan(1/8).
 * @author Sean A. Irvine
 */
public class A019431 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019431() {
    super(0, new A161017());
  }
}
