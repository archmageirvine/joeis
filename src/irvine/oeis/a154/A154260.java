package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154260 Numbers of the form m*(4*m <code>+- 1)/2</code>.
 * @author Sean A. Irvine
 */
public class A154260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154260() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 7, 9, 30, 34});
  }
}
