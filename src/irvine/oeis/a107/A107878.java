package irvine.oeis.a107;
// manually triselect

import irvine.oeis.triangle.TriangleSelector;

/**
 * A107878 Column 2 of triangle A107876.
 * @author Georg Fischer
 */
public class A107878 extends TriangleSelector {

  /** Construct the sequence. */
  public A107878() {
    super(0, new A107876(), 0, n -> new int[]{n, 2});
    skip(2);
  }
}

