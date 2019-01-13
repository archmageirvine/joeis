package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084222.
 * @author Sean A. Irvine
 */
public class A084222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084222() {
    super(new long[] {3, -2}, new long[] {1, 2});
  }
}
