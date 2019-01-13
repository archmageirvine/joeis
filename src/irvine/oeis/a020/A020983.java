package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020983.
 * @author Sean A. Irvine
 */
public class A020983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020983() {
    super(new long[] {1080, -318, 31}, new long[] {1, 31, 643});
  }
}
