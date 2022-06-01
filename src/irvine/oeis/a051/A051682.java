package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051682 11-gonal (or hendecagonal) numbers: a(n) = n*(9*n-7)/2.
 * @author Sean A. Irvine
 */
public class A051682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051682() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 11});
  }
}
