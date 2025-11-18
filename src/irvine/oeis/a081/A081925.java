package irvine.oeis.a081;

import irvine.oeis.FilterSequence;
import irvine.oeis.a020.A020884;

/**
 * A081925 Ordered even short legs of primitive Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A081925 extends FilterSequence {

  /** Construct the sequence. */
  public A081925() {
    super(1, new A020884(), EVEN);
  }
}
