package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220990 12^(2n+1) + 6 * 12^n + 1: the right Aurifeuillian factor of 12^(6n+3) + 1.
 * @author Sean A. Irvine
 */
public class A220990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220990() {
    super(new long[] {1728, -1884, 157}, new long[] {19, 1801, 249697});
  }
}
