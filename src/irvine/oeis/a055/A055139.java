package irvine.oeis.a055;

import irvine.oeis.triangle.TriangleSelector;

/**
 * A055139 Column 0 of triangle A055138.
 * @author Georg Fischer
 */
public class A055139 extends TriangleSelector {

  /** Construct the sequence. */
  public A055139() {
    super(0, new A055138(), 0, n -> new int[] {n, 0});
  }
}
