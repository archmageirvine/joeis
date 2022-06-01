package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168616 a(n) = 2^n - 5.
 * @author Sean A. Irvine
 */
public class A168616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168616() {
    super(new long[] {-2, 3}, new long[] {-4, -3});
  }
}
