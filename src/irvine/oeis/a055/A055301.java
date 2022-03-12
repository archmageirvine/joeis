package irvine.oeis.a055;

import irvine.oeis.triangle.TriangleSelector;

/**
 * A055301 Column 2 of triangle A055300.
 * @author Georg Fischer
 */
public class A055301 extends TriangleSelector {

  /** Construct the sequence. */
  public A055301() {
    super(1, new A055300(), 1, n -> new int[] {n, 1});
  }
}
