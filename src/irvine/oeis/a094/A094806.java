package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094806 Number of <code>(s(0), s(1), ..., s(2n))</code> such that <code>0 &lt; s(i) &lt; 8</code> and <code>|s(i) - s(i-1)| = 1</code> for <code>i = 1,2,...,2n, s(0) = 1, s(2n) = 5</code>.
 * @author Sean A. Irvine
 */
public class A094806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094806() {
    super(new long[] {4, -10, 6}, new long[] {1, 5, 20});
  }
}
