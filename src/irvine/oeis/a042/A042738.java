package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042738 Numerators of continued fraction convergents to sqrt(899).
 * @author Sean A. Irvine
 */
public class A042738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042738() {
    super(new long[] {-1, 0, 60, 0}, new long[] {29, 30, 1769, 1799});
  }
}
