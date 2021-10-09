package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016466 Continued fraction for log(38).
 * @author Sean A. Irvine
 */
public class A016466 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016466() {
    super(new A016661());
  }
}
