package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022655 Expansion of Product_{m&gt;=1} (1+m*q^m)^27.
 * @author Sean A. Irvine
 */
public class A022655 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022655() {
    super(new A022654(), new A022629());
  }
}
