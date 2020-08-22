package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132772 a(n) = n*(n + 30).
 * @author Sean A. Irvine
 */
public class A132772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132772() {
    super(new long[] {1, -3, 3}, new long[] {0, 31, 64});
  }
}
