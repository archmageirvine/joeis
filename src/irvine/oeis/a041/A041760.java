package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041760 Numerators of continued fraction convergents to <code>sqrt(401)</code>.
 * @author Sean A. Irvine
 */
public class A041760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041760() {
    super(new long[] {1, 40}, new long[] {20, 801});
  }
}
