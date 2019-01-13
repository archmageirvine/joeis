package irvine.oeis.a004;

import irvine.oeis.LinearRecurrence;

/**
 * A004254.
 * @author Sean A. Irvine
 */
public class A004254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A004254() {
    super(new long[]{-1, 5}, new long[] {0, 1});
  }
}
