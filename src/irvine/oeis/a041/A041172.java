package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041172 Numerators of continued fraction convergents to sqrt(96).
 * @author Sean A. Irvine
 */
public class A041172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041172() {
    super(new long[] {-1, 0, 0, 0, 98, 0, 0, 0}, new long[] {9, 10, 39, 49, 921, 970, 3831, 4801});
  }
}
