package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246643.
 * @author Sean A. Irvine
 */
public class A246643 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246643() {
    super(new long[] {729, -279, 31}, new long[] {1, 10, 121});
  }
}
