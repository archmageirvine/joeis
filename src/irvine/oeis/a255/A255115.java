package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255115 Number of n-length words on <code>{0,1,2}</code> in which 0 appears only in runs of length 2.
 * @author Sean A. Irvine
 */
public class A255115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255115() {
    super(new long[] {2, 0, 2}, new long[] {1, 2, 5});
  }
}
