package irvine.oeis.a193;
// Generated by gen_seq4.pl trigf 1, -1, -3, 0, 0, 0 1, -2, -5, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A193726 Triangular array:  the fusion of polynomial sequences P and Q given by p(n,x)=(x+2)^n and q(n,x)=(x+2)^n.
 * @author Georg Fischer
 */
public class A193726 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A193726() {
    super(0, new long[] {1, -1, -3, 0, 0, 0}, new long[] {1, -2, -5, 0, 0, 0});
  }
}
