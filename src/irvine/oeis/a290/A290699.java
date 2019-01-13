package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290699.
 * @author Sean A. Irvine
 */
public class A290699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290699() {
    super(new long[] {-2, 7, -9, 5}, new long[] {2, 6, 14, 28});
  }
}
