package irvine.oeis.a154;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A154106 a(n) = 12*n^2 + 22*n + 11.
 * @author Sean A. Irvine
 */
public class A154106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154106() {
    super(new long[] {1, -3, 3}, new long[] {11, 45, 103});
  }
}
