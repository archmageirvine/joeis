package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123865 a(n) = n^4 - 1.
 * @author Sean A. Irvine
 */
public class A123865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123865() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 15, 80, 255, 624});
  }
}
