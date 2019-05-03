package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212981 Number of <code>(w,x,y)</code> with all terms in <code>{0,...,n}</code> and w <code>&lt;= x + y</code> and <code>x &lt</code>; y.
 * @author Sean A. Irvine
 */
public class A212981 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212981() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 2, 8, 21, 43});
  }
}
