package irvine.oeis.a010;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A010290 Continued fraction for cube root of 61.
 * @author Sean A. Irvine
 */
public class A010290 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010290() {
    super(new A010632());
  }
}
