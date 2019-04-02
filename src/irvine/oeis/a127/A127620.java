package irvine.oeis.a127;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A127620 Number of walks from (0,0) to (n,n) in the region 0 &lt;= x-y &lt;= 6 with the steps (1,0), (0, 1), (2,0) and (0,2). 
 * @author Georg Fischer
 */
public class A127620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127620() {
    super(new long[] {4L, -12L, -11L, 6L, 5L}, new long[] {1L, 1L, 5L, 22L, 117L});
  } // constructor()
} // A127620
