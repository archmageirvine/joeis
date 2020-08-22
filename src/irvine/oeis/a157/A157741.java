package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157741 a(n) = 388962*n^2 + 1764*n + 1.
 * @author Sean A. Irvine
 */
public class A157741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157741() {
    super(new long[] {1, -3, 3}, new long[] {390727, 1559377, 3505951});
  }
}
