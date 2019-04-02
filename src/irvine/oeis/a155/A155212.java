package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155212 a(n) = (n^2 + 9*n + 4)/2.
 * @author Sean A. Irvine
 */
public class A155212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155212() {
    super(new long[] {1, -3, 3}, new long[] {2, 7, 13});
  }
}
