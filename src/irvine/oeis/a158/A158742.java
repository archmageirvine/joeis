package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158742 <code>a(n) = 74*n^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A158742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158742() {
    super(new long[] {1, -3, 3}, new long[] {1, 75, 297});
  }
}
