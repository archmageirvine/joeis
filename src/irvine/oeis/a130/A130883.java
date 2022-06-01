package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130883 a(n) = 2*n^2 - n + 1.
 * @author Sean A. Irvine
 */
public class A130883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130883() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 7});
  }
}
