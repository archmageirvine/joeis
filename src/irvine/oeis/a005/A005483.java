package irvine.oeis.a005;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A005483 Continued fraction for cube root of 7.
 * @author Sean A. Irvine
 */
public class A005483 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A005483() {
    super(new A005482());
  }
}
