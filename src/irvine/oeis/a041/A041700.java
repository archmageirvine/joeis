package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041700 Numerators of continued fraction convergents to sqrt(370).
 * @author Sean A. Irvine
 */
public class A041700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041700() {
    super(new long[] {1, 0, 0, 654, 0, 0}, new long[] {19, 77, 327, 12503, 50339, 213859});
  }
}
