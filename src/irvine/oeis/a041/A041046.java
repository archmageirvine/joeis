package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041046 Numerators of continued fraction convergents to sqrt(29).
 * @author Sean A. Irvine
 */
public class A041046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041046() {
    super(new long[] {1, 0, 0, 0, 0, 140, 0, 0, 0, 0}, new long[] {5, 11, 16, 27, 70, 727, 1524, 2251, 3775, 9801});
  }
}
