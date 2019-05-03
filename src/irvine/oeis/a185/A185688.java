package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185688 First differences of <code>A060819(n-4)*A060819(n)</code>.
 * @author Sean A. Irvine
 */
public class A185688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185688() {
    super(new long[] {-1, -1, -1, -1, 2, 2, 2, 2, -1, -1, -1}, new long[] {2, -2, 3, 5, -2, 18, -19, 43, -30, 62, -71});
  }
}
