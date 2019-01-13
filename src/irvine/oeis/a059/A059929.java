package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059929.
 * @author Sean A. Irvine
 */
public class A059929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059929() {
    super(new long[] {-1, 2, 2}, new long[] {0, 2, 3});
  }
}
