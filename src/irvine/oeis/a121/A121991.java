package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121991 a(n) = 3*a(n-1) - a(n-2) - a(n-3) + 12.
 * @author Sean A. Irvine
 */
public class A121991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121991() {
    super(new long[] {1, 0, -4, 4}, new long[] {0, 1, 13, 50});
  }
}
