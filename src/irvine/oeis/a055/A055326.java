package irvine.oeis.a055;

import irvine.oeis.triangle.TriangleSelector;

/**
 * A055326 Column 1 of triangle A055325.
 * @author Georg Fischer
 */
public class A055326 extends TriangleSelector {

  /** Construct the sequence. */
  public A055326() {
    super(1, new A055325(), 1, n -> new int[]{n, 1});
  }
}
