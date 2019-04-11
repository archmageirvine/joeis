package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159741 <code>a(n) = 8*(2^n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A159741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159741() {
    super(new long[] {-2, 3}, new long[] {8, 24});
  }
}
