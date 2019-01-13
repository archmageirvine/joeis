package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199111.
 * @author Sean A. Irvine
 */
public class A199111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199111() {
    super(new long[] {-3, 4}, new long[] {9, 25});
  }
}
