package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061722 a(n) = 10 * n^2 + 7.
 * @author Sean A. Irvine
 */
public class A061722 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061722() {
    super(new long[] {1, -3, 3}, new long[] {7, 17, 47});
  }
}
