package irvine.oeis.a072;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A060007.
 * @author Sean A. Irvine
 */
public class A072224 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A072224() {
    super(0, new A072223());
  }
}
