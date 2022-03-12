package irvine.oeis.a055;

import irvine.oeis.triangle.TriangleSelector;

/**
 * A055289 Column 1 of triangle A055288.
 * @author Georg Fischer
 */
public class A055289 extends TriangleSelector {

  /** Construct the sequence. */
  public A055289() {
    super(1, new A055288(), 1, n -> new int[] {n, 1});
  }
}
