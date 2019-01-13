package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048573.
 * @author Sean A. Irvine
 */
public class A048573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048573() {
    super(new long[] {2, 1}, new long[] {2, 3});
  }
}
