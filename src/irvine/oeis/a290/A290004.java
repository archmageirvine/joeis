package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290004.
 * @author Sean A. Irvine
 */
public class A290004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290004() {
    super(new long[] {972, -2916, 1761, -395, 35}, new long[] {3, 72, 1419, 26580, 487839});
  }
}
