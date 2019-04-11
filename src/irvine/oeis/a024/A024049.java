package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024049 <code>a(n) = 5^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A024049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024049() {
    super(new long[] {-5, 6}, new long[] {0, 4});
  }
}
