package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042097 Denominators of continued fraction convergents to sqrt(572).
 * @author Sean A. Irvine
 */
public class A042097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042097() {
    super(new long[] {-1, 0, 0, 0, 574, 0, 0, 0}, new long[] {1, 1, 11, 12, 563, 575, 6313, 6888});
  }
}
