package irvine.oeis.a180;
// Generated by gen_seq4.pl trigf 1, 0, 0, 0, 1, 0, 0, 0, 0, 0 1, -1, -1, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A180562 Triangle read by rows: T(n,k) = number of binary words of length n avoiding 010 and having k 1's.
 * @author Georg Fischer
 */
public class A180562 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A180562() {
    super(0, new long[] {1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, new long[] {1, -1, -1, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
