package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262019.
 * @author Sean A. Irvine
 */
public class A262019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262019() {
    super(new long[] {1, -179, 179}, new long[] {15, 3575, 637215});
  }
}
