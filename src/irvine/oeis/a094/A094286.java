package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094286 Number of (s(0), s(1), ..., s(n)) such that <code>0 &lt;</code> s(i) <code>&lt; 6</code> and |s(i) - s(i-1)| <code>&lt;= 1</code> for i <code>= 1,2,</code>....,n, s(0) <code>= 1,</code> s(n) <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A094286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094286() {
    super(new long[] {4, -2, -6, 5}, new long[] {1, 2, 4, 9});
  }
}
