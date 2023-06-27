package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277106 a(n) = 8*3^n - 12.
 * @author Sean A. Irvine
 */
public class A277106 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277106() {
    super(1, new long[] {-3, 4}, new long[] {12, 60});
  }
}
