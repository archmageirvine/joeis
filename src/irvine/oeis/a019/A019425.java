package irvine.oeis.a019;

import irvine.oeis.a161.A161011;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A019425 Continued fraction for tan(1/2).
 * @author Sean A. Irvine
 */
public class A019425 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019425() {
    super(0, new A161011());
  }
}
