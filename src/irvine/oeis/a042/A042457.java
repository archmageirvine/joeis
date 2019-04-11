package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042457 Denominators of continued fraction convergents to <code>sqrt(756)</code>.
 * @author Sean A. Irvine
 */
public class A042457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042457() {
    super(new long[] {-1, 0, 110, 0}, new long[] {1, 2, 109, 220});
  }
}
