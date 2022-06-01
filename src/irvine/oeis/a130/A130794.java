package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130794 Periodic sequence with period 1,5,3.
 * @author Sean A. Irvine
 */
public class A130794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130794() {
    super(new long[] {1, 0, 0}, new long[] {1, 5, 3});
  }
}
