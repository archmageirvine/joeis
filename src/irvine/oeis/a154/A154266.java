package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154266 a(n) = 27*n + 12.
 * @author Sean A. Irvine
 */
public class A154266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154266() {
    super(new long[] {-1, 2}, new long[] {12, 39});
  }
}
