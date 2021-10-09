package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016444 Continued fraction for log(16).
 * @author Sean A. Irvine
 */
public class A016444 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016444() {
    super(new A016639());
  }
}
