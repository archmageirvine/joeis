package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241520 Numbers n such that n^2 == -1 (mod 89).
 * @author Sean A. Irvine
 */
public class A241520 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241520() {
    super(new long[] {-1, 1, 1}, new long[] {34, 55, 123});
  }
}
