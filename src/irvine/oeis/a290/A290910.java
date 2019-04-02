package irvine.oeis.a290;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A290910 a(n) = (1/5)*A290909(n), n&gt;= 0. 
 * @author Georg Fischer
 */
public class A290910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290910() {
    super(new long[] {-1L, 4L, -1L, 4L}, new long[] {0L, 1L, 4L, 15L});
  } // constructor()
} // A290910
