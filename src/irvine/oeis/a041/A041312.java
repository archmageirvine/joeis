package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041312 Numerators of continued fraction convergents to <code>sqrt(170)</code>.
 * @author Sean A. Irvine
 */
public class A041312 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041312() {
    super(new long[] {1, 26}, new long[] {13, 339});
  }
}
