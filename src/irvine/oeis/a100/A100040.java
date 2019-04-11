package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100040 <code>a(n) = 2*n^2 + n - 5</code>.
 * @author Sean A. Irvine
 */
public class A100040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100040() {
    super(new long[] {1, -3, 3}, new long[] {-5, -2, 5});
  }
}
