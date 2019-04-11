package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042018 Numerators of continued fraction convergents to <code>sqrt(533)</code>.
 * @author Sean A. Irvine
 */
public class A042018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042018() {
    super(new long[] {1, 0, 0, 0, 0, 12236, 0, 0, 0, 0}, new long[] {23, 254, 277, 531, 6118, 281959, 3107667, 3389626, 6497293, 74859849});
  }
}
