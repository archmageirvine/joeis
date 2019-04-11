package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193052 <code>a(n) = 5^n - 4^n - 3^n</code>.
 * @author Sean A. Irvine
 */
public class A193052 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193052() {
    super(new long[] {60, -47, 12}, new long[] {-1, -2, 0});
  }
}
