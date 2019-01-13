package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246172.
 * @author Sean A. Irvine
 */
public class A246172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246172() {
    super(new long[] {1, -3, 3}, new long[] {1, 7, 14});
  }
}
