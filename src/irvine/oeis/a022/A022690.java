package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022690 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^30</code>.
 * @author Sean A. Irvine
 */
public class A022690 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022690() {
    super(new A022675());
  }
}
