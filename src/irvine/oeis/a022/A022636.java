package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022636 Expansion of Product_{m&gt;=1} (1 + m*q^m)^8.
 * @author Sean A. Irvine
 */
public class A022636 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022636() {
    super(new A022632());
  }
}
