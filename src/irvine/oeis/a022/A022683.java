package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022683 Expansion of Product_{m&gt;=1} (1-m*q^m)^23.
 * @author Sean A. Irvine
 */
public class A022683 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022683() {
    super(new A022682(), new A022661());
  }
}
