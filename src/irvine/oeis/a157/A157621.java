package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157621 a(n) = 625n^2 - 364n + 53.
 * @author Sean A. Irvine
 */
public class A157621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157621() {
    super(new long[] {1, -3, 3}, new long[] {314, 1825, 4586});
  }
}
