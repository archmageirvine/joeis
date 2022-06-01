package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001641 A Fielder sequence: a(n) = a(n-1) + a(n-2) + a(n-4).
 * @author Sean A. Irvine
 */
public class A001641 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001641() {
    super(new long[] {1, 0, 1, 1}, new long[] {1, 3, 4, 11});
  }
}
