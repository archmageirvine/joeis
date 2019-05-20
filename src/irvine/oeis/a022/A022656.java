package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022656 Expansion of <code>Product_{m&gt;=1} (1+m*q^m)^28</code>.
 * @author Sean A. Irvine
 */
public class A022656 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022656() {
    super(new A022642());
  }
}
