package irvine.oeis.a038;
// Generated by gen_seq4.pl trigf 1 1, -7, -10 at 2020-04-01 15:31
// 
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A038276 Triangle whose (i,j)-th entry is binomial(i,j)*7^(i-j)*10^j.
 * @author Georg Fischer
 */
public class A038276 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A038276() {
    super(0, new long[] {1}, new long[] {1, -7, -10});
  }
}
