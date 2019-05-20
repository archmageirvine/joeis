package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022680 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^20</code>.
 * @author Sean A. Irvine
 */
public class A022680 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022680() {
    super(new A022670());
  }
}
