package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022667 Expansion of <code>Product_{m&gt;=1} (1 - m*q^m)^7</code>.
 * @author Sean A. Irvine
 */
public class A022667 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022667() {
    super(new A022666(), new A022661());
  }
}
