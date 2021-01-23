package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168282 (10*n + 5*(-1)^n - 1)/4.
 * @author Sean A. Irvine
 */
public class A168282 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168282() {
    super(new long[] {-1, 1, 1}, new long[] {1, 6, 6});
  }
}
