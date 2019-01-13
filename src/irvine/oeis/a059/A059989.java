package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059989.
 * @author Sean A. Irvine
 */
public class A059989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059989() {
    super(new long[] {1, -195, 195}, new long[] {0, 56, 10920});
  }
}
