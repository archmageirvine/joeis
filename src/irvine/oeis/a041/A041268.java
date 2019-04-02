package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041268 Numerators of continued fraction convergents to sqrt(147).
 * @author Sean A. Irvine
 */
public class A041268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041268() {
    super(new long[] {-1, 0, 194, 0}, new long[] {12, 97, 2340, 18817});
  }
}
