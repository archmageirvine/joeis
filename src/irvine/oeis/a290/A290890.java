package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290890.
 * @author Sean A. Irvine
 */
public class A290890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290890() {
    super(new long[] {-1, 4, -5, 4}, new long[] {0, 1, 4, 11});
  }
}
