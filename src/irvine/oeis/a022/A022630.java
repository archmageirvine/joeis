package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022630 Expansion of Product_{m&gt;=1} (1 + m*q^m)^2.
 * @author Sean A. Irvine
 */
public class A022630 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022630() {
    super(new A022629());
  }
}
