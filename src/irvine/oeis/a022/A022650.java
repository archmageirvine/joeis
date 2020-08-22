package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022650 Expansion of Product_{m&gt;=1} (1+m*q^m)^22.
 * @author Sean A. Irvine
 */
public class A022650 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022650() {
    super(new A022639());
  }
}
