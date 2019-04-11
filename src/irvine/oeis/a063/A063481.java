package irvine.oeis.a063;

import irvine.oeis.LinearRecurrence;

/**
 * A063481 <code>a(n) = 4^n + 8^n</code>.
 * @author Sean A. Irvine
 */
public class A063481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A063481() {
    super(new long[] {-32, 12}, new long[] {2, 12});
  }
}
