package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262342.
 * @author Sean A. Irvine
 */
public class A262342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262342() {
    super(new long[] {1, -8, 8}, new long[] {10, 65, 442});
  }
}
