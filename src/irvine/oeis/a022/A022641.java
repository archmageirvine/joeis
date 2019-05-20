package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022641 Expansion of <code>Product_{m&gt;=1} (1 + m*q^m)^13</code>.
 * @author Sean A. Irvine
 */
public class A022641 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022641() {
    super(new A022640(), new A022629());
  }
}
