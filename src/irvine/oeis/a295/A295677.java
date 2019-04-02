package irvine.oeis.a295;
// Generated at 2019-04-01 by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A295677 a(n) = a(n-1) + a(n-3) + a(n-4), where a(0) = 1, a(1) = 1, a(2) = 4, a(3) = -3. 
 * @author Georg Fischer
 */
public class A295677 extends LinearRecurrence {

  /** Construct the sequence. */
  public A295677() {
    super(new long[] {1L, 1L, 0L, 1L}, new long[] {1L, 1L, 4L, -3L});
  } // constructor()
} // A295677
