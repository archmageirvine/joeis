package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247612 a(n) = Sum_{k=0..7} binomial(14,k)*binomial(n,k).
 * @author Sean A. Irvine
 */
public class A247612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247612() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 15, 120, 680, 3060, 11628, 38760, 116280});
  }
}
