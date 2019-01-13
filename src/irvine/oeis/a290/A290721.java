package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290721.
 * @author Sean A. Irvine
 */
public class A290721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290721() {
    super(new long[] {4, -9, 6}, new long[] {2, 13, 60});
  }
}
