package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042751 Denominators of continued fraction convergents to sqrt(906).
 * @author Sean A. Irvine
 */
public class A042751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042751() {
    super(new long[] {-1, 0, 602, 0}, new long[] {1, 10, 601, 6020});
  }
}
