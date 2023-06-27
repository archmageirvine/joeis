package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157999 a(n) = 338n - 1.
 * @author Sean A. Irvine
 */
public class A157999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157999() {
    super(1, new long[] {-1, 2}, new long[] {337, 675});
  }
}
