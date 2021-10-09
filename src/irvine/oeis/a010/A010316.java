package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010316 Continued fraction for cube root of 88.
 * @author Sean A. Irvine
 */
public class A010316 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010316() {
    super(new A010658());
  }
}
