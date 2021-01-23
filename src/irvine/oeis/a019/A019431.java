package irvine.oeis.a019;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a161.A161017;

/**
 * A019431 Continued fraction for tan(1/8).
 * @author Sean A. Irvine
 */
public class A019431 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019431() {
    super(new A161017());
  }
}
