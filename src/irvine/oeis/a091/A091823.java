package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091823.
 * @author Sean A. Irvine
 */
public class A091823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091823() {
    super(new long[] {1, -3, 3}, new long[] {4, 13, 26});
  }
}
