package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157443 a(n) = 121*n^2 - 38*n + 3.
 * @author Sean A. Irvine
 */
public class A157443 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157443() {
    super(new long[] {1, -3, 3}, new long[] {86, 411, 978});
  }
}
