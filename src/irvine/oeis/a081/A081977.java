package irvine.oeis.a081;

import irvine.oeis.FilterSequence;

/**
 * A081977 Odd long legs of primitive Pythagorean triangles sorted on semiperimeter.
 * @author Sean A. Irvine
 */
public class A081977 extends FilterSequence {

  /** Construct the sequence. */
  public A081977() {
    super(1, new A081872(), ODD);
  }
}
