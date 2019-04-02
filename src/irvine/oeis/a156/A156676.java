package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156676 a(n) = 81*n^2 - 44*n + 6.
 * @author Sean A. Irvine
 */
public class A156676 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156676() {
    super(new long[] {1, -3, 3}, new long[] {6, 43, 242});
  }
}
