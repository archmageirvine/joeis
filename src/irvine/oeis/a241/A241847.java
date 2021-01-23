package irvine.oeis.a241;

import irvine.oeis.LinearRecurrence;

/**
 * A241847 a(n) = n^2 + 17.
 * @author Sean A. Irvine
 */
public class A241847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241847() {
    super(new long[] {1, -3, 3}, new long[] {17, 18, 21});
  }
}
