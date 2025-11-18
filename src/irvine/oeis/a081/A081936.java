package irvine.oeis.a081;

import irvine.oeis.FilterSequence;

/**
 * A081936 Odd short legs of primitive Pythagorean triangles sorted on semiperimeter.
 * @author Sean A. Irvine
 */
public class A081936 extends FilterSequence {

  /** Construct the sequence. */
  public A081936() {
    super(1, new A081859(), ODD);
  }
}
