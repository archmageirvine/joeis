package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022659 Expansion of Product_{m&gt;=1} (1+m*q^m)^31.
 * @author Sean A. Irvine
 */
public class A022659 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022659() {
    super(new A022658(), new A022629());
  }
}
