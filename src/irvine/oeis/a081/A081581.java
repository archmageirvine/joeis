package irvine.oeis.a081;
// manually 2023-06-02

import irvine.oeis.triangle.GeneratingFunctionTriangle;

/**
 * A081581 Pascal-(1,5,1) array.
 * @author Georg Fischer
 */
public class A081581 extends GeneratingFunctionTriangle {

  /** Construct the sequence. */
  public A081581() {
    super(0, new long[] {1, -1, 0}, new long[] {1, -2, -1, 1, -5, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0});
  }
}
