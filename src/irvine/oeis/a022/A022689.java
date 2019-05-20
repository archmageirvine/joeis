package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022689 Expansion of <code>Product_{m&gt;=1} (1-m*q^m)^29</code>.
 * @author Sean A. Irvine
 */
public class A022689 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022689() {
    super(new A022688(), new A022661());
  }
}
