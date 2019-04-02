package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042110 Numerators of continued fraction convergents to sqrt(580).
 * @author Sean A. Irvine
 */
public class A042110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042110() {
    super(new long[] {-1, 0, 578, 0}, new long[] {24, 289, 13896, 167041});
  }
}
