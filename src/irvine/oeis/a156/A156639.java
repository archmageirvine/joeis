package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156639 a(n) = 169*n^2 - 140*n + 29.
 * @author Sean A. Irvine
 */
public class A156639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156639() {
    super(new long[] {1, -3, 3}, new long[] {58, 425, 1130});
  }
}
