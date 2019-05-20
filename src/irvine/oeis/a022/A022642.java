package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022642 Expansion of <code>Product_{m&gt;=1} (1 + m*q^m)^14</code>.
 * @author Sean A. Irvine
 */
public class A022642 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022642() {
    super(new A022635());
  }
}
