package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126264 <code>a(n) = 5*n^2 + 3*n</code>.
 * @author Sean A. Irvine
 */
public class A126264 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126264() {
    super(new long[] {1, -3, 3}, new long[] {8, 26, 54});
  }
}
