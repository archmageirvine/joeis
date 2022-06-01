package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090300 a(n) = 14*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 14.
 * @author Sean A. Irvine
 */
public class A090300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090300() {
    super(new long[] {1, 14}, new long[] {2, 14});
  }
}
