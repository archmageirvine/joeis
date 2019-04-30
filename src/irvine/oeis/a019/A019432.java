package irvine.oeis.a019;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a161.A161018;

/**
 * A019432 Continued fraction for <code>tan(1/9)</code>.
 * @author Sean A. Irvine
 */
public class A019432 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019432() {
    super(new A161018());
  }
}
