package irvine.oeis.a129;
// Generated by gen_seq4.pl trigf 1, 1, -1, 0, 0, 0 1, 0, -1, 0, 0, 0 at 2020-02-18 21:32
// 0
// 
// DO NOT EDIT here!

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A129186 Right shift operator generating 1's in shifted spaces.
 * @author Georg Fischer
 */
public class A129186 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A129186() {
    super(0, new long[] {1, 1, -1, 0, 0, 0}, new long[] {1, 0, -1, 0, 0, 0});
  }
}
