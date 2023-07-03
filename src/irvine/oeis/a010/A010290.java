package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010290 Continued fraction for cube root of 61.
 * @author Sean A. Irvine
 */
public class A010290 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010290() {
    super(0, new A010632());
  }
}
