package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022670 Expansion of <code>Product_{m &gt;= 1} (1-m*q^m)^10</code>.
 * @author Sean A. Irvine
 */
public class A022670 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022670() {
    super(new A022665());
  }
}
