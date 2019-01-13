package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110241.
 * @author Sean A. Irvine
 */
public class A110241 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110241() {
    super(new long[] {-64, 24, 6}, new long[] {1, 2, 28});
  }
}
