package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168384 a(n) = 4*n - 2*(-1)^n.
 * @author Sean A. Irvine
 */
public class A168384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168384() {
    super(1, new long[] {-1, 1, 1}, new long[] {6, 6, 14});
  }
}
