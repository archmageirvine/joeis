package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214827.
 * @author Sean A. Irvine
 */
public class A214827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214827() {
    super(new long[] {1, 1, 1}, new long[] {1, 5, 5});
  }
}
