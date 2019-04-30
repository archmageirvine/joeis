package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094309 Number of <code>(s(0), s(1), ..., s(n))</code> such that <code>0 &lt; s(i) &lt; 6</code> and <code>|s(i) - s(i-1)| &lt;= 1</code> for <code>i = 1,2,....,n, s(0) = 2, s(n) = 5</code>.
 * @author Sean A. Irvine
 */
public class A094309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094309() {
    super(new long[] {-4, -2, 4}, new long[] {1, 4, 14});
  }
}
