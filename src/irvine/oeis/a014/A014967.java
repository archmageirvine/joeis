package irvine.oeis.a014;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A014967 Continued fraction for Conway's constant.
 * @author Sean A. Irvine
 */
public class A014967 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A014967() {
    super(0, new A014715());
  }
}
