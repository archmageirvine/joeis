package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252585.
 * @author Sean A. Irvine
 */
public class A252585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252585() {
    super(new long[] {1, -1, -482, 482, 1}, new long[] {3, 234, 1617, 112948, 779551});
  }
}
