package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022654 Expansion of Product_{m&gt;=1} (1+m*q^m)^26.
 * @author Sean A. Irvine
 */
public class A022654 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022654() {
    super(new A022641());
  }
}
