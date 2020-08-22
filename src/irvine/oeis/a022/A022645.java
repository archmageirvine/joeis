package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022645 Expansion of Product_{m&gt;=1} (1 + m*q^m)^17.
 * @author Sean A. Irvine
 */
public class A022645 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022645() {
    super(new A022644(), new A022629());
  }
}
