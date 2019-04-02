package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041170 Numerators of continued fraction convergents to sqrt(95).
 * @author Sean A. Irvine
 */
public class A041170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041170() {
    super(new long[] {-1, 0, 0, 0, 78, 0, 0, 0}, new long[] {9, 10, 29, 39, 731, 770, 2271, 3041});
  }
}
