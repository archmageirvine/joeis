package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042622 Numerators of continued fraction convergents to sqrt(840).
 * @author Sean A. Irvine
 */
public class A042622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042622() {
    super(new long[] {-1, 0, 58, 0}, new long[] {28, 29, 1652, 1681});
  }
}
