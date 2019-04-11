package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028347 <code>a(n) = n^2 - 4</code>.
 * @author Sean A. Irvine
 */
public class A028347 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028347() {
    super(new long[] {1, -3, 3}, new long[] {0, 5, 12});
  }
}
