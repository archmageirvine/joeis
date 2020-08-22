package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022631 Expansion of Product_{m&gt;=1} (1 + m*q^m)^3.
 * @author Sean A. Irvine
 */
public class A022631 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022631() {
    super(new A022630(), new A022629());
  }
}
