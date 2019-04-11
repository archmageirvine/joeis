package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041060 Numerators of continued fraction convergents to <code>sqrt(37)</code>.
 * @author Sean A. Irvine
 */
public class A041060 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041060() {
    super(new long[] {1, 12}, new long[] {6, 73});
  }
}
