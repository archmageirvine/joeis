package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027469 a(n) = 49*(n-1)*(n-2)/2.
 * @author Sean A. Irvine
 */
public class A027469 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027469() {
    super(3, new long[] {1, -3, 3}, new long[] {49, 147, 294});
  }
}
