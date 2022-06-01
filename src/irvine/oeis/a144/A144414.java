package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144414 a(n) = 2*(4^n - 1)/3 - n.
 * @author Sean A. Irvine
 */
public class A144414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144414() {
    super(new long[] {4, -9, 6}, new long[] {1, 8, 39});
  }
}
