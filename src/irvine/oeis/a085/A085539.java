package irvine.oeis.a085;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A085539 a(n) = n^6 - n^5.
 * @author Sean A. Irvine
 */
public class A085539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085539() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 32, 486, 3072, 12500, 38880});
  }
}
