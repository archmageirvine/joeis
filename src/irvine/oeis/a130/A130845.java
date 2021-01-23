package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130845 a(4n) = a(4n+1) = a(4n+2) = A001477(n), a(4n+3) = A005408(n).
 * @author Sean A. Irvine
 */
public class A130845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130845() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 0, 0, 1, 1, 1, 1, 3});
  }
}
