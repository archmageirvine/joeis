package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094292 Number of (s(0), s(1), ..., s(n)) such that <code>0 &lt;</code> s(i) <code>&lt; 5</code> and |s(i) - s(i-1)| <code>&lt;= 1</code> for i <code>= 1,2,</code>....,n, s(0) <code>= 2,</code> s(n) <code>= 4</code>.
 * @author Sean A. Irvine
 */
public class A094292 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094292() {
    super(new long[] {1, -2, -3, 4}, new long[] {0, 0, 1, 3});
  }
}
