package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257707 Numbers n such that <code>T(n) + T(n+1) + ... + T(n+22)</code> is a square, where T = A000217 (triangular numbers).
 * @author Sean A. Irvine
 */
public class A257707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257707() {
    super(new long[] {1, -1, 0, 0, 0, 0, -48670, 48670, 0, 0, 0, 0, 1}, new long[] {56, 470, 1094, 7856, 128534, 201539, 3293081, 23435699, 53805155, 382911281, 6256309475L, 9809462822L, 160274811896L});
  }
}
