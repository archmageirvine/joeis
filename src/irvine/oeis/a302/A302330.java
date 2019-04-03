package irvine.oeis.a302;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A302330 a(0)=1, a(1)=97; for n&gt;1, a(n) = 98*a(n-1) - a(n-2). 
 * @author Georg Fischer
 */
public class A302330 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302330() {
    super(new long[] {-1L, 98L}, new long[] {1L, 97L});
  } // constructor()
} // A302330
