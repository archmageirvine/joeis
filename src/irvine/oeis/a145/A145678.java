package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145678 a(n) = 441*n^2 - 21.
 * @author Sean A. Irvine
 */
public class A145678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145678() {
    super(1, new long[] {1, -3, 3}, new long[] {420, 1743, 3948});
  }
}
