package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110210.
 * @author Sean A. Irvine
 */
public class A110210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110210() {
    super(new long[] {6, 0, -5}, new long[] {-1, 1, -5});
  }
}
