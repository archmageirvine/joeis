package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130218.
 * @author Sean A. Irvine
 */
public class A130218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130218() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 10, 29, 70});
  }
}
