package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094286 Number of <code>(s(0), s(1), ..., s(n))</code> such that <code>0 &lt; s(i) &lt; 6</code> and <code>|s(i) - s(i-1)| &lt;= 1</code> for <code>i = 1,2,....,n, s(0) = 1, s(n) = 1</code>.
 * @author Sean A. Irvine
 */
public class A094286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094286() {
    super(new long[] {4, -2, -6, 5}, new long[] {1, 2, 4, 9});
  }
}
