package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041660 Numerators of continued fraction convergents to sqrt(349).
 * @author Sean A. Irvine
 */
public class A041660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041660() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 18420, 0, 0, 0, 0, 0, 0}, new long[] {18, 19, 56, 411, 2933, 6277, 9210, 337837, 347047, 1031931, 7570564, 54025879, 115622322, 169648201});
  }
}
