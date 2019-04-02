package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042623 Denominators of continued fraction convergents to sqrt(840).
 * @author Sean A. Irvine
 */
public class A042623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042623() {
    super(new long[] {-1, 0, 58, 0}, new long[] {1, 1, 57, 58});
  }
}
