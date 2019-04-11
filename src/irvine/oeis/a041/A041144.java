package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041144 Numerators of continued fraction convergents to <code>sqrt(82)</code>.
 * @author Sean A. Irvine
 */
public class A041144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041144() {
    super(new long[] {1, 18}, new long[] {9, 163});
  }
}
