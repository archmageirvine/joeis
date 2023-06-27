package irvine.oeis.a072;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A072201 a(n) = 4*a(n-1) + 1, a(1) = 15.
 * @author Sean A. Irvine
 */
public class A072201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072201() {
    super(1, new long[] {-4, 5}, new long[] {15, 61});
  }
}
