package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132761 a(n) = n*(n+17).
 * @author Sean A. Irvine
 */
public class A132761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132761() {
    super(new long[] {1, -3, 3}, new long[] {0, 18, 38});
  }
}
