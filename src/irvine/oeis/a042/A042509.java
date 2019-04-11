package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042509 Denominators of continued fraction convergents to <code>sqrt(782)</code>.
 * @author Sean A. Irvine
 */
public class A042509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042509() {
    super(new long[] {-1, 0, 0, 0, 1566, 0, 0, 0}, new long[] {1, 1, 27, 28, 1539, 1567, 42281, 43848});
  }
}
