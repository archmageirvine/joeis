package irvine.oeis.a019;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a161.A161013;

/**
 * A019427 Continued fraction for tan(1/4).
 * @author Sean A. Irvine
 */
public class A019427 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019427() {
    super(new A161013());
  }
}
