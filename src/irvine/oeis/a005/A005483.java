package irvine.oeis.a005;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A005483 Continued fraction for cube root of 7.
 * @author Sean A. Irvine
 */
public class A005483 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A005483() {
    super(0, new A005482());
  }
}
