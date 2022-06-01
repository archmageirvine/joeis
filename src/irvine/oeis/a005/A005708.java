package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005708 a(n) = a(n-1) + a(n-6), with a(i) = 1 for i = 0..5.
 * @author Sean A. Irvine
 */
public class A005708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005708() {
    super(new long[] {1, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1});
  }
}

