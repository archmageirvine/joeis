package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219056 a(n) = 3*n^4.
 * @author Sean A. Irvine
 */
public class A219056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219056() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 3, 48, 243, 768});
  }
}
