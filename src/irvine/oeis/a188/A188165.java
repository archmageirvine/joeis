package irvine.oeis.a188;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A188165 2^n + 9.
 * @author Sean A. Irvine
 */
public class A188165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188165() {
    super(new long[] {-2, 3}, new long[] {10, 11});
  }
}
