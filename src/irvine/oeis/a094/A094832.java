package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094832 Number of <code>(s(0), s(1), ..., s(2n+1))</code> such that <code>0 &lt; s(i) &lt; 9</code> and <code>|s(i) - s(i-1)| = 1</code> for <code>i = 1,2,....,2n+1, s(0) = 3, s(2n+1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A094832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094832() {
    super(new long[] {1, -9, 6}, new long[] {1, 3, 10});
  }
}
