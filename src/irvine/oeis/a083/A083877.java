package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083877 Absolute value of determinant of n X n matrix where the element <code>a(i,j) =</code> if <code>i + j &gt; n</code> then <code>2*(i + j -n) - 1</code>, else <code>2*(n + 1 - i - j)</code>.
 * @author Sean A. Irvine
 */
public class A083877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083877() {
    super(new long[] {-9, -3, 5}, new long[] {1, 5, 25});
  }
}
