package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173512 <code>a(n) = 8*n + 4 + n mod 2</code>.
 * @author Sean A. Irvine
 */
public class A173512 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173512() {
    super(new long[] {-1, 1, 1}, new long[] {4, 13, 20});
  }
}
