package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290912 <code>a(n) = (1/6)*A290911(n)</code>.
 * @author Sean A. Irvine
 */
public class A290912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290912() {
    super(new long[] {-1, 4, 0, 4}, new long[] {0, 1, 4, 16});
  }
}
