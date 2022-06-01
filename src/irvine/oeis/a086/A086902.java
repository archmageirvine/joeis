package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086902 a(n) = 7*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 7.
 * @author Sean A. Irvine
 */
public class A086902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086902() {
    super(new long[] {1, 7}, new long[] {2, 7});
  }
}
