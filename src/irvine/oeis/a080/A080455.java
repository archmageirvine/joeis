package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080455 a(1)=1; for n&gt;1, a(n) = a(n-1) if n is already in the sequence, a(n) = a(n-1) + 4 otherwise.
 * @author Sean A. Irvine
 */
public class A080455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080455() {
    super(1, new long[] {-1, 1, 0, 0, 1}, new long[] {1, 5, 9, 13, 13});
  }
}
