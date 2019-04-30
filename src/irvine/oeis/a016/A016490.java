package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016490 Continued fraction for <code>log(62)</code>.
 * @author Sean A. Irvine
 */
public class A016490 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016490() {
    super(new A016685());
  }
}
