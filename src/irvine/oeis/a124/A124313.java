package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124313.
 * @author Sean A. Irvine
 */
public class A124313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124313() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {1, 0, 0, 0, 1});
  }
}
