package irvine.oeis.a107;
// manually triselect

import irvine.oeis.triangle.TriangleSelector;

/**
 * A107882 Column 1 of triangle A107880.
 * @author Georg Fischer
 */
public class A107882 extends TriangleSelector {

  /** Construct the sequence. */
  public A107882() {
    super(0, new A107880(), 0, n -> new int[]{n, 1});
    skip();
  }
}

