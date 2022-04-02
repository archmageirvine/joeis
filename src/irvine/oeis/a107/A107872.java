package irvine.oeis.a107;
// manually triselect

import irvine.oeis.SkipSequence;
import irvine.oeis.triangle.TriangleSelector;

/**
 * A107872 Column 1 of triangle A107870; a(n) = C(n*(n+1)/2 + n+2, n).
 * @author Georg Fischer
 */
public class A107872 extends SkipSequence {

  /** Construct the sequence. */
  public A107872() {
    super(new TriangleSelector(0, new A107870(), 0, n -> new int[] {n, 1}), 1);
  }
}

