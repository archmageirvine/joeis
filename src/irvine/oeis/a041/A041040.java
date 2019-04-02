package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041040 Numerators of continued fraction convergents to sqrt(26).
 * @author Sean A. Irvine
 */
public class A041040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041040() {
    super(new long[] {1, 10}, new long[] {5, 51});
  }
}
