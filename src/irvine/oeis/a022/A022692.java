package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022692 Expansion of Product_{m&gt;=1} (1-m*q^m)^32.
 * @author Sean A. Irvine
 */
public class A022692 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022692() {
    super(new A022676());
  }
}
