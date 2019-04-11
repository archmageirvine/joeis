package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042759 Denominators of continued fraction convergents to <code>sqrt(910)</code>.
 * @author Sean A. Irvine
 */
public class A042759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042759() {
    super(new long[] {-1, 0, 362, 0}, new long[] {1, 6, 361, 2172});
  }
}
