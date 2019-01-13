package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001922.
 * @author Sean A. Irvine
 */
public class A001922 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001922() {
    super(new long[] {1, -15, 15}, new long[] {1, 8, 105});
  }
}
