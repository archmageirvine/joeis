package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176972 a(n) = 7^n + 7*n + 1.
 * @author Sean A. Irvine
 */
public class A176972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176972() {
    super(new long[] {7, -15, 9}, new long[] {2, 15, 64});
  }
}
