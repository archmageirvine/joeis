package irvine.oeis.a081;
// Generated by gen_seq4.pl rio at 2021-10-28 23:47

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A081579 Pascal-(1,4,1) array.
 *
 * @author Georg Fischer
 */
public class A081579 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A081579() {
    super(0, new long[] {1, -1, 0}, new long[] {1, -2, -1, 1, -3, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0});
  }
}
