package irvine.oeis.a181;
// Generated by gen_seq4.pl trigf 1, -1, 1, -1, 0, 0 1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A181650 Inverse of number triangle A070909.
 * @author Georg Fischer
 */
public class A181650 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A181650() {
    super(0, new long[] {1, -1, 1, -1, 0, 0}, new long[] {1, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
