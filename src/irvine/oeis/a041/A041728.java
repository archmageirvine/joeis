package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041728 Numerators of continued fraction convergents to <code>sqrt(384)</code>.
 * @author Sean A. Irvine
 */
public class A041728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041728() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9602, 0, 0, 0, 0, 0, 0, 0}, new long[] {19, 20, 39, 98, 921, 1940, 2861, 4801, 185299, 190100, 375399, 940898, 8843481, 18627860, 27471341, 46099201});
  }
}
