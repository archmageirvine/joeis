package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016509 Continued fraction for log(81).
 * @author Sean A. Irvine
 */
public class A016509 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016509() {
    super(new A016704());
  }
}
