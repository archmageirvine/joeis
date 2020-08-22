package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022669 Expansion of Product_{m&gt;=1} (1 - m*q^m)^9.
 * @author Sean A. Irvine
 */
public class A022669 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022669() {
    super(new A022668(), new A022661());
  }
}
