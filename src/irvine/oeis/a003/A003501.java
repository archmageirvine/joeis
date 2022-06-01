package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003501 a(n) = 5*a(n-1) - a(n-2), with a(0) = 2, a(1) = 5.
 * @author Sean A. Irvine
 */
public class A003501 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003501() {
    super(new long[] {-1, 5}, new long[] {2, 5});
  }
}

