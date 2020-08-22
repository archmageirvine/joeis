package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022666 Expansion of Product_{m&gt;=1} (1 - m*q^m)^6.
 * @author Sean A. Irvine
 */
public class A022666 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022666() {
    super(new A022663());
  }
}
