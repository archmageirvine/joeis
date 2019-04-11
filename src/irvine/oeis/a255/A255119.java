package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255119 Number of n-length words on <code>{0,1,2,3,4,5,6}</code> in which 0 appears only in runs of length 2.
 * @author Sean A. Irvine
 */
public class A255119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255119() {
    super(new long[] {6, 0, 6}, new long[] {1, 6, 37});
  }
}
