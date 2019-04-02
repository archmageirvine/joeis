package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024036 a(n) = 4^n - 1.
 * @author Sean A. Irvine
 */
public class A024036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024036() {
    super(new long[] {-4, 5}, new long[] {0, 3});
  }
}
