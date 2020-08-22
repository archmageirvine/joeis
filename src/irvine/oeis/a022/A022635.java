package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022635 Expansion of Product_{m&gt;=1} (1 + m*q^m)^7.
 * @author Sean A. Irvine
 */
public class A022635 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022635() {
    super(new A022634(), new A022629());
  }
}
