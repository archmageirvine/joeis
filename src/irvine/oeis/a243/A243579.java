package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243579.
 * @author Sean A. Irvine
 */
public class A243579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243579() {
    super(new long[] {1, -3, 3}, new long[] {71, 255, 567});
  }
}
