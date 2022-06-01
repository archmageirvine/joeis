package irvine.oeis.a283;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A283428 Starting with a(1)=3, a(2)=4, a(n)=sum of digits of a(n-1) + sum of digits of a(n-2).
 * @author Sean A. Irvine
 */
public class A283428 extends LinearRecurrence {

  /** Construct the sequence. */
  public A283428() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {3, 4, 7, 11, 9, 11, 11, 4, 6, 10, 7, 8, 15, 14, 11, 7, 9, 16, 16, 14, 12, 8, 11});
  }
}
