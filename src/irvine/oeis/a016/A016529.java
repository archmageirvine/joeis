package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016529 Continued fraction for <code>log(3/2)</code>.
 * @author Sean A. Irvine
 */
public class A016529 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016529() {
    super(new A016578());
  }
}
