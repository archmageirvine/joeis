package irvine.oeis.a049;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A049341 a(n+1) = sum of digits of a(n) + a(n-1).
 * @author Sean A. Irvine
 */
public class A049341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049341() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {3, 6, 9, 6, 6, 3, 9, 3});
  }
}
