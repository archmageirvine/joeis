package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192975.
 * @author Sean A. Irvine
 */
public class A192975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192975() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 1, 8, 19});
  }
}
