package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041480 Numerators of continued fraction convergents to <code>sqrt(257)</code>.
 * @author Sean A. Irvine
 */
public class A041480 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041480() {
    super(new long[] {1, 32}, new long[] {16, 513});
  }
}
