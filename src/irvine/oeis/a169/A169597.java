package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169597.
 * @author Sean A. Irvine
 */
public class A169597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169597() {
    super(new long[] {-1, 1, 1}, new long[] {2, 15, 21});
  }
}
