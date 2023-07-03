package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107877 Column 1 of triangle A107876.
 * @author Georg Fischer
 */
public class A107877 extends SkipSequence {

  /** Construct the sequence. */
  public A107877() {
    super(0, new TriangleSelector(0, new A107876(), 0, n -> new int[]{n, 1}), 1);
  }
}

