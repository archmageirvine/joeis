package irvine.oeis.a129;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A129973 a(n) = A000045(n) - A000931(n).
 * @author Sean A. Irvine
 */
public class A129973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129973() {
    super(1, new long[] {-1, -2, 0, 2, 1}, new long[] {0, 0, 0, 1, 1});
  }
}
