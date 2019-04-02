package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295857 a(n) = a(n-1) + 3*a(n-2) -2*a(n-3) - 2*a(n-4), where a(0) = 0, a(1) = 0, a(2) = 2, a(3) = 3. 
 * @author Georg Fischer
 */
public class A295857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295857() {
    super(new long[] {-2L, -2L, 3L, 1L}, new long[] {0L, 0L, 2L, 3L});
  } // constructor()
} // A295857
