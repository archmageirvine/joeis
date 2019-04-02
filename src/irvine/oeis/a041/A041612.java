package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041612 Numerators of continued fraction convergents to sqrt(325).
 * @author Sean A. Irvine
 */
public class A041612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041612() {
    super(new long[] {1, 36}, new long[] {18, 649});
  }
}
