package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107875 Column 1 of triangle A107873; a(n) = C( n*(n+1)/2 + n+3, n).
 * @author Georg Fischer
 */
public class A107875 extends SkipSequence {

  /** Construct the sequence. */
  public A107875() {
    super(new TriangleSelector(0, new A107873(), 0, n -> new int[] {n, 1}), 1);
  }
}

