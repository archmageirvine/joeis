package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145995 a(n) = 8 - 12*n + 5*n^2.
 * @author Sean A. Irvine
 */
public class A145995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145995() {
    super(1, new long[] {1, -3, 3}, new long[] {1, 4, 17});
  }
}
