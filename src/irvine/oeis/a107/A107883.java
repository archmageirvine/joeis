package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107883 Column 3 of triangle A107880.
 * @author Georg Fischer
 */
public class A107883 extends SkipSequence {

  /** Construct the sequence. */
  public A107883() {
    super(0, new TriangleSelector(0, new A107880(), 0, n -> new int[]{n, 3}), 3);
  }
}

