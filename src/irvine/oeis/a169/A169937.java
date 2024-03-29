package irvine.oeis.a169;
// Generated by gen_seq4.pl A140901/parmof3 at 2022-07-07 19:07

import irvine.oeis.a140.A140901;

/**
 * A169937 a(n) = binomial(m+n-1,n)^2 - binomial(m+n,n+1)*binomial(m+n-2,n-1) with m = 14.
 * @author Georg Fischer
 */
public class A169937 extends A140901 {

  /** Construct the sequence. */
  public A169937() {
    super(0, 12, 2);
  }
}
