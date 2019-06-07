package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157474 <code>a(n) = 16n^2 + n</code>.
 * @author Sean A. Irvine
 */
public class A157474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157474() {
    super(new long[] {1, -3, 3}, new long[] {17, 66, 147});
  }
}
