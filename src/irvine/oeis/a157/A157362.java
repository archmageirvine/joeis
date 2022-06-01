package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157362 a(n) = 49*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A157362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157362() {
    super(new long[] {1, -3, 3}, new long[] {47, 192, 435});
  }
}
