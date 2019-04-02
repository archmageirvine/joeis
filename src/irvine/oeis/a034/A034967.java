package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034967 Sum of digits of numbers between 0 and (10^n)-1.
 * @author Sean A. Irvine
 */
public class A034967 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034967() {
    super(new long[] {-100, 20}, new long[] {0, 45});
  }
}
