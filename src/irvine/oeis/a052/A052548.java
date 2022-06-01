package irvine.oeis.a052;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A052548 a(n) = 2^n + 2.
 * @author Sean A. Irvine
 */
public class A052548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052548() {
    super(new long[] {-2, 3}, new long[] {3, 4});
  }
}
