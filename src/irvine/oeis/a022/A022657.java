package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022657 Expansion of <code>Product_{m&gt;=1} (1+m*q^m)^29</code>.
 * @author Sean A. Irvine
 */
public class A022657 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022657() {
    super(new A022656(), new A022629());
  }
}
