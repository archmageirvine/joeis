package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202564.
 * @author Sean A. Irvine
 */
public class A202564 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202564() {
    super(new long[] {1, -99, 99}, new long[] {1, 91, 8901});
  }
}
