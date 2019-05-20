package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022652 Expansion of <code>Product_{m&gt;=1} (1+m*q^m)^24</code>.
 * @author Sean A. Irvine
 */
public class A022652 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022652() {
    super(new A022640());
  }
}
