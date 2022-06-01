package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156795 a(n) = 81*n - 59.
 * @author Sean A. Irvine
 */
public class A156795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156795() {
    super(new long[] {-1, 2}, new long[] {22, 103});
  }
}
