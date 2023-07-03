package irvine.oeis.a019;

import irvine.oeis.a161.A161014;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A019428 Continued fraction for tan(1/5).
 * @author Sean A. Irvine
 */
public class A019428 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019428() {
    super(0, new A161014());
  }
}
