package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181963 Prime-generating polynomial: 25*n^2 - 1185*n + 14083.
 * @author Sean A. Irvine
 */
public class A181963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181963() {
    super(new long[] {1, -3, 3}, new long[] {14083, 12923, 11813});
  }
}
