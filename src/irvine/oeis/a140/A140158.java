package irvine.oeis.a140;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A140158 a(1)=1, a(n) = a(n-1) + n^4 if n odd, a(n) = a(n-1) + n^1 if n is even. 
 * @author Georg Fischer
 */
public class A140158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140158() {
    super(new long[] {-1L, 1L, 5L, -5L, -10L, 10L, 10L, -10L, -5L, 5L, 1L}, new long[] {1L, 3L, 84L, 88L, 713L, 719L, 3120L, 3128L, 9689L, 9699L, 24340L});
  } // constructor()
} // A140158
