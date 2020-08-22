package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022674 Expansion of Product_{m &gt;= 1} (1-m*q^m)^14.
 * @author Sean A. Irvine
 */
public class A022674 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022674() {
    super(new A022667());
  }
}
