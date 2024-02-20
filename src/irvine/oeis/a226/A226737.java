package irvine.oeis.a226;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A226737 a(n) = 11^n + n.
 * @author Sean A. Irvine
 */
public class A226737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226737() {
    super(new long[] {11, -23, 13}, new long[] {1, 12, 123});
  }
}
