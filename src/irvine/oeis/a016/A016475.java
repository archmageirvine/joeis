package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016475 Continued fraction for log(47).
 * @author Sean A. Irvine
 */
public class A016475 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016475() {
    super(new A016670());
  }
}
