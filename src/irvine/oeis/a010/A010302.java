package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010302 Continued fraction for cube root of 74.
 * @author Sean A. Irvine
 */
public class A010302 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010302() {
    super(new A010644());
  }
}
