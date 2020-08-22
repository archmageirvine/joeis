package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180509 Solutions a(n) of (a(n)-5)*(a(n)-6) = 21 *b(n)*(b(n)-1).
 * @author Sean A. Irvine
 */
public class A180509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180509() {
    super(new long[] {1, -1, 0, 0, -110, 110, 0, 0, 1}, new long[] {6, 12, 26, 104, 159, 741, 2267, 10841, 16890});
  }
}
