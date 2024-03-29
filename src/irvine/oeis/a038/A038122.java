package irvine.oeis.a038;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.recur.LinearRecurrence;

/**
 * A038122 Start with {1,2,...,n}, replace any two numbers a,b with |a^2-b^2|, repeat until single number k remains; a(n) = minimal value of k.
 * @author Georg Fischer
 */
public class A038122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038122() {
    super(1, new long[] {1L, 0L, 0L, -1L, 0L, 0L, 1L, 0L, 0L}, new long[] {0L, 3L, 1L, 0L, 0L, 1L, 3L, 0L, 4L}, 1L, 3L, 0L, 16L, 15L, 63L, 8L);
  } // constructor()
} // A038122
