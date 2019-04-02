package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086927 a(n) = 10*a(n-1) + a(n-2), starting with a(0) = 2 and a(1) = 10.
 * @author Sean A. Irvine
 */
public class A086927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086927() {
    super(new long[] {1, 10}, new long[] {2, 10});
  }
}
