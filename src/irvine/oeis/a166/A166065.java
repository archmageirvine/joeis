package irvine.oeis.a166;
// Generated by gen_seq4.pl trigf 1, -2, 1, 0, 0, 0 1, -2, -1, 0, 2, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A166065 Triangle, read by rows, given by [0,1,1,0,0,0,0,0,0,0,...] DELTA [2,-1,0,0,0,0,0,0,0,...] where DELTA is the operator defined in A084938.
 * @author Georg Fischer
 */
public class A166065 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A166065() {
    super(0, new long[] {1, -2, 1, 0, 0, 0}, new long[] {1, -2, -1, 0, 2, 0, 0, 0, 0, 0});
  }
}
