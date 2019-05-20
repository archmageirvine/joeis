package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022691 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^31</code>.
 * @author Sean A. Irvine
 */
public class A022691 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022691() {
    super(new A022690(), new A022661());
  }
}
