package irvine.oeis.a176;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A176635 a(n) = 6*a(n-1)-8*a(n-2) for n &gt; 1; a(0) = 57, a(1) = 242. 
 * @author Georg Fischer
 */
public class A176635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176635() {
    super(new long[] {-8L, 6L}, new long[] {57L, 242L});
  } // constructor()
} // A176635
