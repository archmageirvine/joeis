package irvine.oeis.a034;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A034472 a(n) = 3^n + 1.
 * @author Sean A. Irvine
 */
public class A034472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034472() {
    super(new long[] {-3, 4}, new long[] {2, 4});
  }
}
