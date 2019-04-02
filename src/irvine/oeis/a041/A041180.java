package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041180 Numerators of continued fraction convergents to sqrt(101).
 * @author Sean A. Irvine
 */
public class A041180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041180() {
    super(new long[] {1, 20}, new long[] {10, 201});
  }
}
