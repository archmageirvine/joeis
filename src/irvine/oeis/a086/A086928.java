package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086928 a(n) = 12*a(n-1) + a(n-2), with a(0) = 2 and a(1) = 12.
 * @author Sean A. Irvine
 */
public class A086928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086928() {
    super(new long[] {1, 12}, new long[] {2, 12});
  }
}
