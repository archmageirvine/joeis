package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107887 Column 2 of triangle A107884.
 * @author Georg Fischer
 */
public class A107887 extends SkipSequence {

  /** Construct the sequence. */
  public A107887() {
    super(new TriangleSelector(0, new A107884(), 0, n -> new int[] {n, 2}), 2);
  }
}

