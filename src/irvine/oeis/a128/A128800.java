package irvine.oeis.a128;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A128800 a(n) = n*(n-1)*6^n.
 * @author Sean A. Irvine
 */
public class A128800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128800() {
    super(new long[] {216, -108, 18}, new long[] {0, 0, 72});
  }
}
