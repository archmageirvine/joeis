package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157078 a(n) = 32805000*n^2 - 55096200*n + 23133601.
 * @author Sean A. Irvine
 */
public class A157078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157078() {
    super(new long[] {1, -3, 3}, new long[] {842401, 44161201, 153090001});
  }
}
