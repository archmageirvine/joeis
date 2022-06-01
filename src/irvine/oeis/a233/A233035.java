package irvine.oeis.a233;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A233035 a(n) = n * floor(n/4).
 * @author Sean A. Irvine
 */
public class A233035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233035() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 0, 0, 4, 5, 6, 7, 16, 18});
  }
}
