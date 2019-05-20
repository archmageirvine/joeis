package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022665 Expansion of <code>Product_{m&gt;=1} (1 - m*q^m)^5</code>.
 * @author Sean A. Irvine
 */
public class A022665 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022665() {
    super(new A022664(), new A022661());
  }
}
