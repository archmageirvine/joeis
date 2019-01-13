package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290631.
 * @author Sean A. Irvine
 */
public class A290631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290631() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 15, 50, 119});
  }
}
