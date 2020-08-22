package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022640 Expansion of Product_{m&gt;=1} (1 + m*q^m)^12.
 * @author Sean A. Irvine
 */
public class A022640 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022640() {
    super(new A022634());
  }
}
