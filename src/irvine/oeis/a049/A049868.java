package irvine.oeis.a049;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A049868 a(n)=Sum{a(k): k=0,1,2,...,n-4,n-2,n-1}; a(n-3) is not a summand; 3 initial terms required. 
 * @author Georg Fischer
 */
public class A049868 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049868() {
    super(new long[] {1L, -1L, 0L, 2L}, new long[] {1L, 2L, 2L, 4L});
  } // constructor()
} // A049868
