package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173657.
 * @author Sean A. Irvine
 */
public class A173657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173657() {
    super(new long[] {6, -11, 6}, new long[] {4, 7, 15});
  }
}
