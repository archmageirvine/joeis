package irvine.oeis.a319;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A319543 <code>a(n) = 1*2*3 - 4*5*6 + 7*8*9 - 10*11*12 + 13*14*15 -</code> ... <code>+ (up</code> to <code>n)</code>.
 * @author Georg Fischer
 */
public class A319543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A319543() {
    super(new long[] {1L, -1L, 0L, 4L, -4L, 0L, 6L, -6L, 0L, 4L, -4L, 0L, 1L}, new long[] {1L, 2L, 6L, 2L, -14L, -114L, -107L, -58L, 390L, 380L, 280L, -930L, -917L});
  } // constructor()
} // A319543
