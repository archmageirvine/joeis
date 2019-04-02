package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042056 Numerators of continued fraction convergents to sqrt(552).
 * @author Sean A. Irvine
 */
public class A042056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042056() {
    super(new long[] {-1, 0, 94, 0}, new long[] {23, 47, 2185, 4417});
  }
}
