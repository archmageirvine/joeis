package irvine.oeis.a049;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A049007 Continued fraction for i^i = exp(-Pi/2).
 * @author Sean A. Irvine
 */
public class A049007 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A049007() {
    super(new A049006());
  }
}
