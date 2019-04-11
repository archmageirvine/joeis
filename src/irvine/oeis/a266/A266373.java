package irvine.oeis.a266;
// Generated by gen_linrec.pl - DO NOT EDIT here!

import irvine.oeis.LinearRecurrence;

/**
 * A266373 G.f. <code>= b(2)*b(6)*b(10)/(x^15+x^14+x^13+x^12+x^11-2*x^5-x^4-x^3-x^2-x+1),</code> where <code>b(k) = (1-x^k)/(1-x)</code>.
 * @author Georg Fischer
 */
public class A266373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A266373() {
    super(new long[] {-1L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 2L}, new long[] {4L, 10L, 22L, 46L, 95L, 193L, 388L, 778L, 1558L, 3118L, 6236L}, new long[] {1L});
  } // constructor()
} // A266373
