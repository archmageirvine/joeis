package irvine.oeis.a302;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A302906 a(0) = 0; for n &gt; 0, a(n) = a(n-1) + 5*n + 4. 
 * @author Georg Fischer
 */
public class A302906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A302906() {
    super(new long[] {1L, -3L, 3L}, new long[] {0L, 9L, 23L});
  } // constructor()
} // A302906
