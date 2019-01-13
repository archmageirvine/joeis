package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028148.
 * @author Sean A. Irvine
 */
public class A028148 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028148() {
    super(new long[] {-2688, 1616, -344, 31}, new long[] {1, 31, 617, 10079});
  }
}
