package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022649 Expansion of <code>Product_{m &gt;=1} (1+m*q^m)^21</code>.
 * @author Sean A. Irvine
 */
public class A022649 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022649() {
    super(new A022648(), new A022629());
  }
}
