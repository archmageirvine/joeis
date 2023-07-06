package irvine.oeis.a107;
// manually triselect

import irvine.oeis.triangle.TriangleSelector;

/**
 * A107869 Column 1 of triangle A107867; a(n) = binomial( n*(n+1)/2 + n+1, n).
 * @author Georg Fischer
 */
public class A107869 extends TriangleSelector {

  /** Construct the sequence. */
  public A107869() {
    super(0, new A107867(), 0, n -> new int[]{n, 1});
    skip();
  }
}

