package irvine.oeis.a000;

import irvine.oeis.ConvolutionSequence;

/**
 * A000712 Generating function = Product_{m&gt;=1} 1/(1 - x^m)^2; a(n) = number of partitions of n into parts of 2 kinds.
 * @author Sean A. Irvine
 */
public class A000712 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A000712() {
    super(new A000041());
  }
}
