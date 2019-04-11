package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155588 <code>a(n) = 5^n + 2^n - 1^n</code>.
 * @author Sean A. Irvine
 */
public class A155588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155588() {
    super(new long[] {10, -17, 8}, new long[] {1, 6, 28});
  }
}
