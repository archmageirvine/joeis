package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161705.
 * @author Sean A. Irvine
 */
public class A161705 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161705() {
    super(new long[] {-1, 2}, new long[] {1, 19});
  }
}
