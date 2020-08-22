package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022673 Expansion of Product_{m &gt;= 1} (1-m*q^m)^13.
 * @author Sean A. Irvine
 */
public class A022673 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022673() {
    super(new A022672(), new A022661());
  }
}
