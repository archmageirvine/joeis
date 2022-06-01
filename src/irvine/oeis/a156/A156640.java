package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156640 a(n) = 169*n^2 + 140*n + 29.
 * @author Sean A. Irvine
 */
public class A156640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156640() {
    super(new long[] {1, -3, 3}, new long[] {29, 338, 985});
  }
}
