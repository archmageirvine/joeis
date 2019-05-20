package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022658 Expansion of <code>Product_{m&gt;=1} (1+m*q^m)^30</code>.
 * @author Sean A. Irvine
 */
public class A022658 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022658() {
    super(new A022643());
  }
}
