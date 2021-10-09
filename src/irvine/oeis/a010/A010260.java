package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010260 Continued fraction for cube root of 31.
 * @author Sean A. Irvine
 */
public class A010260 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010260() {
    super(new A010602());
  }
}
