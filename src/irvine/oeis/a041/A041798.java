package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041798 Numerators of continued fraction convergents to sqrt(420).
 * @author Sean A. Irvine
 */
public class A041798 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041798() {
    super(new long[] {-1, 0, 82, 0}, new long[] {20, 41, 1660, 3361});
  }
}
