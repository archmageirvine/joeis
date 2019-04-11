package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042397 Denominators of continued fraction convergents to <code>sqrt(725)</code>.
 * @author Sean A. Irvine
 */
public class A042397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042397() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 19602, 0, 0, 0, 0, 0}, new long[] {1, 1, 13, 27, 337, 364, 19265, 19629, 254813, 529255, 6605873, 7135128});
  }
}
