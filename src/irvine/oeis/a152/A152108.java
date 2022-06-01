package irvine.oeis.a152;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A152108 a(n) = ((7+sqrt(5))^n + (7-sqrt(5))^n)/2.
 * @author Sean A. Irvine
 */
public class A152108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152108() {
    super(new long[] {-44, 14}, new long[] {1, 7});
  }
}
