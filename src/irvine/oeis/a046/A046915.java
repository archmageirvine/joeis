package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046915 Sum of divisors of 10^n.
 * @author Sean A. Irvine
 */
public class A046915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046915() {
    super(new long[] {-100, 180, -97, 18}, new long[] {1, 18, 217, 2340});
  }
}
