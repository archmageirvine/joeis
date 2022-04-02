package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107888 Column 4 of triangle A107884.
 * @author Georg Fischer
 */
public class A107888 extends SkipSequence {

  /** Construct the sequence. */
  public A107888() {
    super(new TriangleSelector(0, new A107884(), 0, n -> new int[] {n, 4}), 4);
  }
}

