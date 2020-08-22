package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022648 Expansion of Product_{m&gt;=1} (1 + m*q^m)^20.
 * @author Sean A. Irvine
 */
public class A022648 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022648() {
    super(new A022638());
  }
}
