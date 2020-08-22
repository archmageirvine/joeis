package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088320 a(n) = 10a(n-1) + a(n-2), starting with a(0) = 1 and a(1) = 5.
 * @author Sean A. Irvine
 */
public class A088320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088320() {
    super(new long[] {1, 10}, new long[] {1, 5});
  }
}
