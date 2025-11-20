package irvine.oeis.a081;

import irvine.oeis.FilterSequence;

/**
 * A081963 Even short legs of primitive Pythagorean triangles sorted on semiperimeter.
 * @author Sean A. Irvine
 */
public class A081963 extends FilterSequence {

  /** Construct the sequence. */
  public A081963() {
    super(1, new A081859(), EVEN);
  }
}
