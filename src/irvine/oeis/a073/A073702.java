package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073702 a(n) = A073145(n)^2.
 * @author Sean A. Irvine
 */
public class A073702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073702() {
    super(new long[] {-1, 2, 3, 6, -1, 0}, new long[] {9, 1, 1, 25, 25, 1});
  }
}
