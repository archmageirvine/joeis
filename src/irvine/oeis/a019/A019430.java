package irvine.oeis.a019;

import irvine.oeis.a161.A161016;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A019430 Continued fraction for tan(1/7).
 * @author Sean A. Irvine
 */
public class A019430 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019430() {
    super(0, new A161016());
  }
}
