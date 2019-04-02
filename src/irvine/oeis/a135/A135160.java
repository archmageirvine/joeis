package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135160 a(n) = 5^n + 3^n - 2^n.
 * @author Sean A. Irvine
 */
public class A135160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135160() {
    super(new long[] {30, -31, 10}, new long[] {1, 6, 30});
  }
}
