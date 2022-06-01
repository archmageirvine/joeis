package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100189 Equatorial structured meta-anti-diamond numbers, the n-th number from an equatorial structured n-gonal anti-diamond number sequence.
 * @author Sean A. Irvine
 */
public class A100189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100189() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 27, 92, 245});
  }
}
