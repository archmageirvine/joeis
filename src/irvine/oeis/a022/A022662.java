package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022662 Expansion of Product_{m&gt;=1} (1 - m*q^m)^2.
 * @author Sean A. Irvine
 */
public class A022662 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022662() {
    super(new A022661());
  }
}
