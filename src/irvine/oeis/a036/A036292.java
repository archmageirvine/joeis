package irvine.oeis.a036;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A036292 a(n) = n*6^n.
 * @author Sean A. Irvine
 */
public class A036292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036292() {
    super(new long[] {-36, 12}, new long[] {0, 6});
  }
}
