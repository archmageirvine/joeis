package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168604 a(n) = 2^(n-2) - 1.
 * @author Sean A. Irvine
 */
public class A168604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168604() {
    super(new long[] {-2, 3}, new long[] {1, 3});
  }
}
