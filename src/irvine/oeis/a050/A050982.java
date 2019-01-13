package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050982.
 * @author Sean A. Irvine
 */
public class A050982 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050982() {
    super(new long[] {-15625, 18750, -9375, 2500, -375, 30}, new long[] {1, 30, 525, 7000, 78750, 787500});
  }
}
