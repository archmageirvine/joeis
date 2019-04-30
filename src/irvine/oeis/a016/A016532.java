package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016532 Continued fraction for <code>log(9/2)</code>.
 * @author Sean A. Irvine
 */
public class A016532 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016532() {
    super(new A016581());
  }
}
