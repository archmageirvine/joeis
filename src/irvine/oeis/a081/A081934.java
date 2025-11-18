package irvine.oeis.a081;

import irvine.oeis.FilterSequence;
import irvine.oeis.a020.A020883;

/**
 * A081934 Ordered odd long legs of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A081934 extends FilterSequence {

  /** Construct the sequence. */
  public A081934() {
    super(1, new A020883(), ODD);
  }
}
