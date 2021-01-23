package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154267 a(n) = 27*n + 15.
 * @author Sean A. Irvine
 */
public class A154267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154267() {
    super(new long[] {-1, 2}, new long[] {15, 42});
  }
}
