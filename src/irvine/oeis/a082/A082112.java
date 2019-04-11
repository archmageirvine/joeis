package irvine.oeis.a082;

import irvine.oeis.LinearRecurrence;

/**
 * A082112 <code>a(n) = 4n^2 + 10n + 1</code>.
 * @author Sean A. Irvine
 */
public class A082112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082112() {
    super(new long[] {1, -3, 3}, new long[] {1, 15, 37});
  }
}
