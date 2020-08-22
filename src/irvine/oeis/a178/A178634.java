package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178634 a(n) = 63 * ((10^n - 1)/9)^2.
 * @author Sean A. Irvine
 */
public class A178634 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178634() {
    super(new long[] {1000, -1110, 111}, new long[] {63, 7623, 776223});
  }
}
