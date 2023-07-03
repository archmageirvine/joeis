package irvine.oeis.a019;

import irvine.oeis.a161.A161018;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A019432 Continued fraction for tan(1/9).
 * @author Sean A. Irvine
 */
public class A019432 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019432() {
    super(0, new A161018());
  }
}
