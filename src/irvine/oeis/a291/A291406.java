package irvine.oeis.a291;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A291406 a(n) = (1/2)A291405(n).
 * @author Sean A. Irvine
 */
public class A291406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291406() {
    super(new long[] {2, 8, 12, 8, 4, 4, 2, 0}, new long[] {0, 1, 2, 4, 12, 26, 60, 145});
  }
}
