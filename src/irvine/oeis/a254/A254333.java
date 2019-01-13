package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254333.
 * @author Sean A. Irvine
 */
public class A254333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254333() {
    super(new long[] {1, -1, -1442, 1442, 1}, new long[] {1, 16, 1156, 22801, 1666681});
  }
}
