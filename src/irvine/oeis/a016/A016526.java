package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016526 Continued fraction for log(98).
 * @author Sean A. Irvine
 */
public class A016526 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016526() {
    super(new A016721());
  }
}
