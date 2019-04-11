package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042968 <code>a(n) = 1 + n + floor(n/3)</code>.
 * @author Sean A. Irvine
 */
public class A042968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042968() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 5});
  }
}
