package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090301 a(n) = 15*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 15.
 * @author Sean A. Irvine
 */
public class A090301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090301() {
    super(new long[] {1, 15}, new long[] {2, 15});
  }
}
