package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132762 a(n) = n*(n + 19).
 * @author Sean A. Irvine
 */
public class A132762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132762() {
    super(new long[] {1, -3, 3}, new long[] {0, 20, 42});
  }
}
