package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022679 Expansion of Product_{m&gt;=1} (1-m*q^m)^19.
 * @author Sean A. Irvine
 */
public class A022679 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022679() {
    super(new A022678(), new A022661());
  }
}
