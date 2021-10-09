package irvine.oeis.a019;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a161.A161015;

/**
 * A019429 Continued fraction for tan(1/6).
 * @author Sean A. Irvine
 */
public class A019429 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019429() {
    super(new A161015());
  }
}
