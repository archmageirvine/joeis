package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290764.
 * @author Sean A. Irvine
 */
public class A290764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290764() {
    super(new long[] {3, -7, 5}, new long[] {3, 15, 54});
  }
}
