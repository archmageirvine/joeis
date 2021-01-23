package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117619 a(n) = n^2 + 7.
 * @author Sean A. Irvine
 */
public class A117619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117619() {
    super(new long[] {1, -3, 3}, new long[] {7, 8, 11});
  }
}
