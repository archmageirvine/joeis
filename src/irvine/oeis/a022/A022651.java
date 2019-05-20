package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022651 Expansion of <code>Product_{m&gt;=1} (1+m*q^m)^23</code>.
 * @author Sean A. Irvine
 */
public class A022651 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022651() {
    super(new A022650(), new A022629());
  }
}
