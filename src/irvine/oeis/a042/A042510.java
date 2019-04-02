package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042510 Numerators of continued fraction convergents to sqrt(783).
 * @author Sean A. Irvine
 */
public class A042510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042510() {
    super(new long[] {-1, 0, 56, 0}, new long[] {27, 28, 1539, 1567});
  }
}
