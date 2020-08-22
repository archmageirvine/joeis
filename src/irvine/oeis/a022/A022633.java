package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022633 Expansion of Product_{m&gt;=1} (1 + m*q^m)^5.
 * @author Sean A. Irvine
 */
public class A022633 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022633() {
    super(new A022632(), new A022629());
  }
}
