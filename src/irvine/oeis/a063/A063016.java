package irvine.oeis.a063;
// Generated by gen_seq4.pl holos at 2021-06-06 21:33
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A063016 a(n) is the product of Catalan(n) and (2^(n+1) - 1).
 * -8*(2*n-1)*(2*n-3)+6*n*(2*n-1)*A-(n+1)*n*A^2A062027
 * @author Georg Fischer
 */
public class A063016 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A063016() {
    super(0, "[[0],[-24, 64,-32],[0,-6, 12],[0,-1,-1]]", "[1, 3, 14]", 0);
  }
}
