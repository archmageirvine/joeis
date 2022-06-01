package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134158 a(n) = 1 + 27n + 252n^2 + 882n^3 + 1029n^4.
 * @author Sean A. Irvine
 */
public class A134158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134158() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 2191, 24583, 109513, 324013});
  }
}
