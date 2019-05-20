package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022682 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^22</code>.
 * @author Sean A. Irvine
 */
public class A022682 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022682() {
    super(new A022671());
  }
}
