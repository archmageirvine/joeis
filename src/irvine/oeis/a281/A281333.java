package irvine.oeis.a281;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A281333 a(n) = 1 + floor(n/2) + floor(n^2/3).
 * @author Sean A. Irvine
 */
public class A281333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281333() {
    super(new long[] {1, -1, -1, 0, 1, 1}, new long[] {1, 1, 3, 5, 8, 11});
  }
}
