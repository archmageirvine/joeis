package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022663 Expansion of <code>Product_{m&gt;=1} (1 - m*q^m)^3</code>.
 * @author Sean A. Irvine
 */
public class A022663 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022663() {
    super(new A022662(), new A022661());
  }
}
