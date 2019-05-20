package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022637 Expansion of <code>Product_{m&gt;=1} (1 + m*q^m)^9</code>.
 * @author Sean A. Irvine
 */
public class A022637 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022637() {
    super(new A022636(), new A022629());
  }
}
