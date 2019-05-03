package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100503 Bisection of <code>A000125</code>.
 * @author Sean A. Irvine
 */
public class A100503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100503() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 15, 42});
  }
}
