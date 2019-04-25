package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094831 Number of (s(0), s(1), <code>...,</code> s(2n)) such that <code>0 &lt;</code> s(i) <code>&lt; 9</code> and |s(i) - s(i-1)| <code>= 1</code> for <code>i = 1,2,....,2n,</code> s(0) <code>= 3,</code> s(2n) <code>= 3</code>.
 * @author Sean A. Irvine
 */
public class A094831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094831() {
    super(new long[] {1, -9, 6}, new long[] {1, 2, 6});
  }
}
