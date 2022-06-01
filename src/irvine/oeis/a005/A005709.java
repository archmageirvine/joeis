package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005709 a(n) = a(n-1) + a(n-7), with a(i) = 1 for i = 0..6.
 * @author Sean A. Irvine
 */
public class A005709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005709() {
    super(new long[] {1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1});
  }
}

