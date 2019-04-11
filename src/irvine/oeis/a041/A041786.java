package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041786 Numerators of continued fraction convergents to <code>sqrt(414)</code>.
 * @author Sean A. Irvine
 */
public class A041786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041786() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 48670, 0, 0, 0, 0, 0, 0, 0}, new long[] {20, 41, 61, 468, 997, 7447, 8444, 24335, 981844, 1988023, 2969867, 22777092, 48524051, 362445449, 410969500, 1184384449});
  }
}
