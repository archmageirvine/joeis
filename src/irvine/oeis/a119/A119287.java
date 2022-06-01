package irvine.oeis.a119;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A119287 Alternating sum of the sixth powers of the first n Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A119287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119287() {
    super(new long[] {-1, -12, 117, 156, -520, 156, 117, -12}, new long[] {0, -1, 0, -64, 665, -14960, 247184, -4579625});
  }
}
