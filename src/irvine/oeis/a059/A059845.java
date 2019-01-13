package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059845.
 * @author Sean A. Irvine
 */
public class A059845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059845() {
    super(new long[] {1, -3, 3}, new long[] {0, 7, 17});
  }
}
