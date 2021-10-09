package irvine.oeis.a046;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A046096 Continued fraction for Calabi's constant.
 * @author Sean A. Irvine
 */
public class A046096 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A046096() {
    super(new A046095());
  }
}

