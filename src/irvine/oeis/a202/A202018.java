package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202018 <code>a(n) = n^2 + n + 41</code>.
 * @author Sean A. Irvine
 */
public class A202018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202018() {
    super(new long[] {1, -3, 3}, new long[] {41, 43, 47});
  }
}
