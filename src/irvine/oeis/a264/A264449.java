package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264449.
 * @author Sean A. Irvine
 */
public class A264449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264449() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 638, 1656, 3162, 5280, 8151});
  }
}
