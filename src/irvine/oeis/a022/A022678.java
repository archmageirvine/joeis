package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022678 Expansion of Product_{m&gt;=1} (1-m*q^m)^18.
 * @author Sean A. Irvine
 */
public class A022678 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022678() {
    super(new A022669());
  }
}
