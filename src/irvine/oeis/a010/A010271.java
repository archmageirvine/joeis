package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010271 Continued fraction for cube root of 42.
 * @author Sean A. Irvine
 */
public class A010271 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010271() {
    super(0, new A010613());
  }
}
