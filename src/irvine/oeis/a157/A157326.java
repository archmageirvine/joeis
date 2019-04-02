package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157326 a(n) = 10368*n^2 + 288*n + 1.
 * @author Sean A. Irvine
 */
public class A157326 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157326() {
    super(new long[] {1, -3, 3}, new long[] {10657, 42049, 94177});
  }
}
