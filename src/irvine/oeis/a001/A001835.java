package irvine.oeis.a001;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A001835 a(n) = 4*a(n-1) - a(n-2), with a(0) = 1, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A001835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001835() {
    super(new long[] {-1, 4}, new long[] {1, 1});
  }
}
