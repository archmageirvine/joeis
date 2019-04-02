package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042040 Numerators of continued fraction convergents to sqrt(544).
 * @author Sean A. Irvine
 */
public class A042040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042040() {
    super(new long[] {-1, 0, 0, 0, 4898, 0, 0, 0}, new long[] {23, 70, 793, 2449, 113447, 342790, 3884137, 11995201});
  }
}
