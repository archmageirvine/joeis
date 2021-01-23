package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157331 a(n) = 128*n^2 - 32*n + 1.
 * @author Sean A. Irvine
 */
public class A157331 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157331() {
    super(new long[] {1, -3, 3}, new long[] {97, 449, 1057});
  }
}
