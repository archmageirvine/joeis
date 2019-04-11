package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042014 Numerators of continued fraction convergents to <code>sqrt(531)</code>.
 * @author Sean A. Irvine
 */
public class A042014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042014() {
    super(new long[] {-1, 0, 1060, 0}, new long[] {23, 530, 24403, 561799});
  }
}
