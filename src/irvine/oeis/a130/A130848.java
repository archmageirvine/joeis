package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130848 Periodic sequence with period (2, 5, 3, -2, -5, -3).
 * @author Sean A. Irvine
 */
public class A130848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130848() {
    super(new long[] {-1, 1}, new long[] {2, 5});
  }
}
