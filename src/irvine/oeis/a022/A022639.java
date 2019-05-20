package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022639 Expansion of <code>Product_{m&gt;=1} (1 + m*q^m)^11</code>.
 * @author Sean A. Irvine
 */
public class A022639 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022639() {
    super(new A022638(), new A022629());
  }
}
