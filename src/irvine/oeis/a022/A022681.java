package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022681 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^21</code>.
 * @author Sean A. Irvine
 */
public class A022681 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022681() {
    super(new A022680(), new A022661());
  }
}
