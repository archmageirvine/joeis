package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022688 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^28</code>.
 * @author Sean A. Irvine
 */
public class A022688 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022688() {
    super(new A022674());
  }
}
