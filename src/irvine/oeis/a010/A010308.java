package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010308 Continued fraction for cube root of 80.
 * @author Sean A. Irvine
 */
public class A010308 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010308() {
    super(0, new A010650());
  }
}
