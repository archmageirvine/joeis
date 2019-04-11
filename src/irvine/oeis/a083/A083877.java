package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083877 Absolute value of determinant of n X n matrix where the element a(i,j) = if i <code>+ j &gt; n</code> then 2*(i <code>+ j -n) - 1,</code> else <code>2*(n + 1 -</code> i <code>- j)</code>.
 * @author Sean A. Irvine
 */
public class A083877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083877() {
    super(new long[] {-9, -3, 5}, new long[] {1, 5, 25});
  }
}
