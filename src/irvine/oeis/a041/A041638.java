package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041638 Numerators of continued fraction convergents to <code>sqrt(338)</code>.
 * @author Sean A. Irvine
 */
public class A041638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041638() {
    super(new long[] {1, 0, 0, 0, 0, 478, 0, 0, 0, 0}, new long[] {18, 37, 55, 92, 239, 8696, 17631, 26327, 43958, 114243});
  }
}
