package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290588.
 * @author Sean A. Irvine
 */
public class A290588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290588() {
    super(new long[] {6, -5, 4, -10, 6}, new long[] {5, 13, 35, 113, 355});
  }
}
