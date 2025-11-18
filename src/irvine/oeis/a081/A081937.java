package irvine.oeis.a081;

import irvine.oeis.FilterSequence;

/**
 * A081937 Even long legs of primitive Pythagorean triangles sorted on semiperimeter.
 * @author Sean A. Irvine
 */
public class A081937 extends FilterSequence {

  /** Construct the sequence. */
  public A081937() {
    super(1, new A081872(), EVEN);
  }
}
