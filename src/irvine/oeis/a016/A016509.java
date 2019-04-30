package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016509 Continued fraction for <code>log(81)</code>.
 * @author Sean A. Irvine
 */
public class A016509 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016509() {
    super(new A016704());
  }
}
