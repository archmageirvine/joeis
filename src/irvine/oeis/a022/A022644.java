package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022644 Expansion of Product_{m&gt;=1} (1 + m*q^m)^16.
 * @author Sean A. Irvine
 */
public class A022644 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022644() {
    super(new A022636());
  }
}
