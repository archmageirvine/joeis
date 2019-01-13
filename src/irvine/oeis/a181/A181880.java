package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181880.
 * @author Sean A. Irvine
 */
public class A181880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181880() {
    super(new long[] {1, 3, 4}, new long[] {1, 4, 19});
  }
}
