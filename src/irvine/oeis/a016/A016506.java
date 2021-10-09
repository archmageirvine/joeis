package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016506 Continued fraction for log(78).
 * @author Sean A. Irvine
 */
public class A016506 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016506() {
    super(new A016701());
  }
}
