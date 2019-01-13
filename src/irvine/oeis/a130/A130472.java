package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130472.
 * @author Sean A. Irvine
 */
public class A130472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130472() {
    super(new long[] {1, 1, -1}, new long[] {0, -1, 1});
  }
}
