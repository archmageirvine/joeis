package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027690 a(n) = n^2 + n + 5.
 * @author Sean A. Irvine
 */
public class A027690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027690() {
    super(new long[] {1, -3, 3}, new long[] {5, 7, 11});
  }
}
