package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022672 Expansion of Product_{m &gt;= 1} (1-m*q^m)^12.
 * @author Sean A. Irvine
 */
public class A022672 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022672() {
    super(new A022666());
  }
}
