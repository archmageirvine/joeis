package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022653 Expansion of Product_{m&gt;=1} (1+m*q^m)^25.
 * @author Sean A. Irvine
 */
public class A022653 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022653() {
    super(new A022652(), new A022629());
  }
}
