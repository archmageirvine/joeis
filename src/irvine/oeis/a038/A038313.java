package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -10, -11 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038313 Triangle whose (i,j)-th entry is binomial(i,j)*10^(i-j)*11^j.
 * @author Georg Fischer
 */
public class A038313 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038313() {
    super(0, new long[] {1}, new long[] {1, -10, -11});
  }
}
