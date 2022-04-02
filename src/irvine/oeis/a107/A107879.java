package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107879 Column 3 of triangle A107876.
 * @author Georg Fischer
 */
public class A107879 extends SkipSequence {

  /** Construct the sequence. */
  public A107879() {
    super(new TriangleSelector(0, new A107876(), 0, n -> new int[] {n, 3}), 3);
  }
}

