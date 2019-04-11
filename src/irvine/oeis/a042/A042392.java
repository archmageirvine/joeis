package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042392 Numerators of continued fraction convergents to <code>sqrt(723)</code>.
 * @author Sean A. Irvine
 */
public class A042392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042392() {
    super(new long[] {-1, 0, 0, 0, 484, 0, 0, 0}, new long[] {26, 27, 215, 242, 12799, 13041, 104086, 117127});
  }
}
