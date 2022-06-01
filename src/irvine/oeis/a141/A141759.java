package irvine.oeis.a141;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A141759 a(n) = 16n^2 + 32n + 15.
 * @author Sean A. Irvine
 */
public class A141759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141759() {
    super(new long[] {1, -3, 3}, new long[] {15, 63, 143});
  }
}
