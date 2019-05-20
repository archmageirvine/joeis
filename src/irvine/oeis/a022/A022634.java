package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022634 Expansion of <code>Product_{m&gt;=1} (1 + m*q^m)^6</code>.
 * @author Sean A. Irvine
 */
public class A022634 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022634() {
    super(new A022631());
  }
}
