package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022686 Expansion of Product_{m&gt;=1} (1-m*q^m)^26.
 * @author Sean A. Irvine
 */
public class A022686 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022686() {
    super(new A022673());
  }
}
