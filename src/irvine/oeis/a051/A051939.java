package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051939 Truncated triangular pyramid numbers: a(n) = Sum_{k=6..n}(k*(k+1)/2 - 18).
 * @author Sean A. Irvine
 */
public class A051939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051939() {
    super(new long[] {-1, 4, -6, 4}, new long[] {3, 13, 31, 58});
  }
}
