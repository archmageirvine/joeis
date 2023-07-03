package irvine.oeis.a010;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A010324 Continued fraction for cube root of 96.
 * @author Sean A. Irvine
 */
public class A010324 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A010324() {
    super(0, new A010666());
  }
}
