package irvine.oeis.a019;

import irvine.oeis.a161.A161015;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A019429 Continued fraction for tan(1/6).
 * @author Sean A. Irvine
 */
public class A019429 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019429() {
    super(0, new A161015());
  }
}
