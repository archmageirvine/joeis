package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -12, -3 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038329 Triangle whose (i,j)-th entry is binomial(i,j)*12^(i-j)*3^j.
 * @author Georg Fischer
 */
public class A038329 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038329() {
    super(0, new long[] {1}, new long[] {1, -12, -3});
  }
}
