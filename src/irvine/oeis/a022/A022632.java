package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022632 Expansion of Product_{m&gt;=1} (1 + m*q^m)^4.
 * @author Sean A. Irvine
 */
public class A022632 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022632() {
    super(new A022630());
  }
}
