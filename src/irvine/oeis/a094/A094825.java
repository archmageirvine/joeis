package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094825 Number of (s(0), s(1), ..., s(2n)) such that 0 &lt; s(i) &lt; 10 and |s(i) - s(i-1)| = 1 for i = 1,2,....,2n, s(0) = 1, s(2n) = 7.
 * @author Sean A. Irvine
 */
public class A094825 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094825() {
    super(new long[] {-5, 20, -21, 8}, new long[] {1, 7, 35, 153});
  }
}
