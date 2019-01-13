package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095125.
 * @author Sean A. Irvine
 */
public class A095125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095125() {
    super(new long[] {-1, 3, 2}, new long[] {1, 3, 8});
  }
}
