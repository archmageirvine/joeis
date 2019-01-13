package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059507.
 * @author Sean A. Irvine
 */
public class A059507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059507() {
    super(new long[] {-1, 6, -11, 6}, new long[] {4, 9, 24, 66});
  }
}
