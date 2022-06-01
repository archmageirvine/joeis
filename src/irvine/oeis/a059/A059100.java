package irvine.oeis.a059;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A059100 a(n) = n^2 + 2.
 * @author Sean A. Irvine
 */
public class A059100 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059100() {
    super(new long[] {1, -3, 3}, new long[] {2, 3, 6});
  }
}
