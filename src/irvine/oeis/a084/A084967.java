package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084967 Multiples of 5 whose GCD with 6 is 1.
 * @author Sean A. Irvine
 */
public class A084967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084967() {
    super(new long[] {-1, 1, 1}, new long[] {5, 25, 35});
  }
}
