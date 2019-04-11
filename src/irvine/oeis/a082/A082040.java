package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082040 <code>a(n) = 9*n^2 + 3*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A082040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082040() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 43});
  }
}
