package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016443 Continued fraction for log(15).
 * @author Sean A. Irvine
 */
public class A016443 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016443() {
    super(new A016638());
  }
}
