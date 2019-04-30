package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016470 Continued fraction for <code>log(42)</code>.
 * @author Sean A. Irvine
 */
public class A016470 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016470() {
    super(new A016665());
  }
}
