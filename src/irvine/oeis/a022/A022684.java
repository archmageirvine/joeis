package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022684 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^24</code>.
 * @author Sean A. Irvine
 */
public class A022684 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022684() {
    super(new A022672());
  }
}
