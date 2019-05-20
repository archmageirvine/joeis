package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022646 Expansion of <code>Product_{m&gt;=1} (1 + m*q^m)^18</code>.
 * @author Sean A. Irvine
 */
public class A022646 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022646() {
    super(new A022637());
  }
}
