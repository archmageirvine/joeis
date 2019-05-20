package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022685 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^25</code>.
 * @author Sean A. Irvine
 */
public class A022685 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022685() {
    super(new A022684(), new A022661());
  }
}
