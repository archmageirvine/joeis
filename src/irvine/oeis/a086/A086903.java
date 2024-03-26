package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086903 a(n) = 8*a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 8.
 * @author Sean A. Irvine
 */
public class A086903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086903() {
    super(new long[] {-1, 8}, new long[] {2, 8});
  }
}
