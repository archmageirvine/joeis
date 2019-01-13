package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214865.
 * @author Sean A. Irvine
 */
public class A214865 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214865() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {9, 11, 13, 15, 25});
  }
}
