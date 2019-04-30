package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016462 Continued fraction for <code>log(34)</code>.
 * @author Sean A. Irvine
 */
public class A016462 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016462() {
    super(new A016657());
  }
}
