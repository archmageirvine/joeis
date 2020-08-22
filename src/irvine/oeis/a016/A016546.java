package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016546 Continued fraction for log(37/2).
 * @author Sean A. Irvine
 */
public class A016546 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016546() {
    super(new A016595());
  }
}
