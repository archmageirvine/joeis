package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165458 a(0)=1, a(1)=4, a(n) = 12*a(n-2) - a(n-1).
 * @author Sean A. Irvine
 */
public class A165458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165458() {
    super(new long[] {12, -1}, new long[] {1, 4});
  }
}
