package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014112 <code>a(n) = n*(n-1) + (n-2)*(n-3) + </code>... <code>+ 1*0 + 1</code> for n odd; otherwise, <code>a(n) = n*(n-1) + (n-2)*(n-3) + </code>... <code>+ 2*1</code>.
 * @author Sean A. Irvine
 */
public class A014112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014112() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {1, 2, 7, 14, 27});
  }
}
