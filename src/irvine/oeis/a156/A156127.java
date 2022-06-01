package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156127 a(n) = 7*2^n - 3.
 * @author Sean A. Irvine
 */
public class A156127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156127() {
    super(new long[] {-2, 3}, new long[] {4, 11});
  }
}
