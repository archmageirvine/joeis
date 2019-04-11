package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046915 Sum of divisors of <code>10^n</code>.
 * @author Sean A. Irvine
 */
public class A046915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046915() {
    super(new long[] {-100, 180, -97, 18}, new long[] {1, 18, 217, 2340});
  }
}
