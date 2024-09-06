package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121201 a(n) = 7^n+5^n-2n.
 * @author Sean A. Irvine
 */
public class A121201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121201() {
    super(new long[] {-35, 82, -60, 14}, new long[] {2, 10, 70, 462});
  }
}
