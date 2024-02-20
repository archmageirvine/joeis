package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226200 a(n) = 6^n + n.
 * @author Sean A. Irvine
 */
public class A226200 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226200() {
    super(new long[] {6, -13, 8}, new long[] {1, 7, 38});
  }
}
