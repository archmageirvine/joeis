package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081912 a(n) = 6^n*(n^2 - n + 72)/72.
 * @author Sean A. Irvine
 */
public class A081912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081912() {
    super(new long[] {216, -108, 18}, new long[] {1, 6, 37});
  }
}
