package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022687 Expansion of Product_{m&gt;=1} (1-m*q^m)^27.
 * @author Sean A. Irvine
 */
public class A022687 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022687() {
    super(new A022686(), new A022661());
  }
}
