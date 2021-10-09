package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016485 Continued fraction for log(57).
 * @author Sean A. Irvine
 */
public class A016485 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016485() {
    super(new A016680());
  }
}
