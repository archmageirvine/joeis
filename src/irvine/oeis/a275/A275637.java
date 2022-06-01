package irvine.oeis.a275;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A275637 a(n) = (3^n-1)*(3^n-3)*(3^n+3)*(3^n-4)/5!.
 * @author Sean A. Irvine
 */
public class A275637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275637() {
    super(new long[] {59049, -88209, 32670, -3630, 121}, new long[] {0, 0, 24, 3588, 336336});
  }
}
