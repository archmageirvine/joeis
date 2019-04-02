package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041160 Numerators of continued fraction convergents to sqrt(90).
 * @author Sean A. Irvine
 */
public class A041160 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041160() {
    super(new long[] {-1, 0, 38, 0}, new long[] {9, 19, 351, 721});
  }
}
