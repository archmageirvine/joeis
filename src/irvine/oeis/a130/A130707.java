package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130707 a(n+3) = 3*(a(n+2) - a(n+1)) + 2*a(n).
 * @author Sean A. Irvine
 */
public class A130707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130707() {
    super(new long[] {2, -3, 3}, new long[] {1, 2, 2});
  }
}
