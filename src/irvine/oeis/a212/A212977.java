package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212977 Number of (w,x,y) with all terms in {0,...,n} and  n/2 &lt; w+x+y &lt;= n.
 * @author Sean A. Irvine
 */
public class A212977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212977() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 3, 6, 16, 25, 46, 64});
  }
}
