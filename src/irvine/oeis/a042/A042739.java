package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042739 Denominators of continued fraction convergents to sqrt(899).
 * @author Sean A. Irvine
 */
public class A042739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042739() {
    super(new long[] {-1, 0, 60, 0}, new long[] {1, 1, 59, 60});
  }
}
