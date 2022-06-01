package irvine.oeis.a102;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A102296 a(n) = (1/6)*(n+1)*(10*n^2 + 17*n + 12).
 * @author Sean A. Irvine
 */
public class A102296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102296() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 13, 43, 102});
  }
}
