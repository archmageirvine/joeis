package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022664 Expansion of <code>Product_{m&gt;=1} (1 - m*q^m)^4</code>.
 * @author Sean A. Irvine
 */
public class A022664 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022664() {
    super(new A022662());
  }
}
