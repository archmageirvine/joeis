package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050492.
 * @author Sean A. Irvine
 */
public class A050492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050492() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 14, 63, 172});
  }
}
