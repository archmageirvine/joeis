package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049293.
 * @author Sean A. Irvine
 */
public class A049293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049293() {
    super(new long[] {-36, 72, -47, 12}, new long[] {0, 0, 4, 34});
  }
}
