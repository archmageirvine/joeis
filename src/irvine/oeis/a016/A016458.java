package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016458 Continued fraction for <code>log(30)</code>.
 * @author Sean A. Irvine
 */
public class A016458 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016458() {
    super(new A016653());
  }
}
