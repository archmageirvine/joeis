package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -9, -4 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038294 Triangle whose (i,j)-th entry is binomial(i,j)*9^(i-j)*4^j.
 * @author Georg Fischer
 */
public class A038294 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038294() {
    super(0, new long[] {1}, new long[] {1, -9, -4});
  }
}
