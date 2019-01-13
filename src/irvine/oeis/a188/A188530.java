package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188530.
 * @author Sean A. Irvine
 */
public class A188530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188530() {
    super(new long[] {8, -14, 7}, new long[] {2, 21, 107});
  }
}
