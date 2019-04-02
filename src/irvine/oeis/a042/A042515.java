package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042515 Denominators of continued fraction convergents to sqrt(786).
 * @author Sean A. Irvine
 */
public class A042515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042515() {
    super(new long[] {-1, 0, 1570, 0}, new long[] {1, 28, 1569, 43960});
  }
}
