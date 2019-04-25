package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094806 Number of (s(0), s(1), <code>...,</code> s(2n)) such that <code>0 &lt;</code> s(i) <code>&lt; 8</code> and |s(i) - s(i-1)| <code>= 1</code> for <code>i = 1,2,...,2n,</code> s(0) <code>= 1,</code> s(2n) <code>= 5</code>.
 * @author Sean A. Irvine
 */
public class A094806 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094806() {
    super(new long[] {4, -10, 6}, new long[] {1, 5, 20});
  }
}
