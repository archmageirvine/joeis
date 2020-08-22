package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022643 Expansion of Product_{m&gt;=1} (1 + m*q^m)^15.
 * @author Sean A. Irvine
 */
public class A022643 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022643() {
    super(new A022642(), new A022629());
  }
}
