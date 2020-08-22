package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022677 Expansion of Product_{m&gt;=1} (1-m*q^m)^17.
 * @author Sean A. Irvine
 */
public class A022677 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022677() {
    super(new A022676(), new A022661());
  }
}
