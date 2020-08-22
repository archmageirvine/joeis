package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022647 Expansion of Product_{m&gt;=1} (1 + m*q^m)^19.
 * @author Sean A. Irvine
 */
public class A022647 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022647() {
    super(new A022646(), new A022629());
  }
}
