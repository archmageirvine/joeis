package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042511 Denominators of continued fraction convergents to sqrt(783).
 * @author Sean A. Irvine
 */
public class A042511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042511() {
    super(new long[] {-1, 0, 56, 0}, new long[] {1, 1, 55, 56});
  }
}
