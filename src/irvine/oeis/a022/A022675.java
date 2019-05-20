package irvine.oeis.a022;

import irvine.oeis.ConvolutionSequence;

/**
 * A022675 Expansion of <code>Product_{m &gt;= 1} (1-m*q^m)^15</code>.
 * @author Sean A. Irvine
 */
public class A022675 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A022675() {
    super(new A022674(), new A022661());
  }
}
