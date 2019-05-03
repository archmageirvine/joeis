package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094831 Number of <code>(s(0), s(1)</code>, ..., <code>s(2n))</code> such that <code>0 &lt; s(i) &lt; 9</code> and <code>|s(i) - s(i-1)| = 1</code> for i <code>= 1,2,....,2n, s(0) = 3, s(2n) = 3</code>.
 * @author Sean A. Irvine
 */
public class A094831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094831() {
    super(new long[] {1, -9, 6}, new long[] {1, 2, 6});
  }
}
