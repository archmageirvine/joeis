package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -3, -9 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038227 Triangle whose (i,j)-th entry is binomial(i,j)*3^(i-j)*9^j.
 * @author Georg Fischer
 */
public class A038227 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038227() {
    super(0, new long[] {1}, new long[] {1, -3, -9});
  }
}
