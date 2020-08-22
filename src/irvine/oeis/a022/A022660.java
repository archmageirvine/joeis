package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022660 Expansion of Product_{m&gt;=1} (1+m*q^m)^32.
 * @author Sean A. Irvine
 */
public class A022660 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022660() {
    super(new A022644());
  }
}
