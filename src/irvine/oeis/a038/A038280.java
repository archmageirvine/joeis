package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -8, -2 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038280 Triangle whose (i,j)-th entry is binomial(i,j)*8^(i-j)*2^j.
 * @author Georg Fischer
 */
public class A038280 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038280() {
    super(0, new long[] {1}, new long[] {1, -8, -2});
  }
}
