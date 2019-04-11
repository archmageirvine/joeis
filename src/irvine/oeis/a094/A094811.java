package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094811 Number of (s(0), s(1), ..., s(2n+1)) such that <code>0 &lt;</code> s(i) <code>&lt; 8</code> and |s(i) - s(i-1)| <code>= 1</code> for i <code>= 1,2,</code>....,2n+1, s(0) <code>= 1,</code> s(2n+1) <code>= 6</code>.
 * @author Sean A. Irvine
 */
public class A094811 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094811() {
    super(new long[] {4, -10, 6}, new long[] {1, 6, 26});
  }
}
