package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291526 <code>a(n) = 2^n*(n - 3) + 4</code>.
 * @author Sean A. Irvine
 */
public class A291526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291526() {
    super(new long[] {4, -8, 5}, new long[] {0, 0, 4});
  }
}
