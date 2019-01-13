package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030113.
 * @author Sean A. Irvine
 */
public class A030113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030113() {
    super(new long[] {1, -1, -8, 7, 21, -15, -20, 10, 5}, new long[] {1, 9, 45, 285, 1695, 10317, 62349, 377739, 2286648});
  }
}
