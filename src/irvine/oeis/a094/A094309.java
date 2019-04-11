package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094309 Number of (s(0), s(1), <code>...,</code> s(n)) such that <code>0 &lt;</code> s(i) <code>&lt; 6</code> and |s(i) - s(i-1)| <code>&lt;= 1</code> for i <code>= 1,2,....,n,</code> s(0) <code>= 2,</code> s(n) <code>= 5</code>.
 * @author Sean A. Irvine
 */
public class A094309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094309() {
    super(new long[] {-4, -2, 4}, new long[] {1, 4, 14});
  }
}
