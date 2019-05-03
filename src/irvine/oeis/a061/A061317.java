package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061317 Split positive integers into extending even groups and sum: <code>1+2, 3+4+5+6, 7+8+9+10+11+12, 13+14+15+16+17+18+19+20</code>, ...
 * @author Sean A. Irvine
 */
public class A061317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061317() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 3, 18, 57});
  }
}
