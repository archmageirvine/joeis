package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220990 <code>12^(2n+1) + 6 * 12^n + 1</code>: the right Aurifeuillian factor of <code>12^(6n+3) + 1</code>.
 * @author Sean A. Irvine
 */
public class A220990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220990() {
    super(new long[] {1728, -1884, 157}, new long[] {19, 1801, 249697});
  }
}
