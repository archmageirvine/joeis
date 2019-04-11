package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255118 Number of n-length words on <code>{0,1,2,3,4,5}</code> in which 0 appears only in runs of length 2.
 * @author Sean A. Irvine
 */
public class A255118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255118() {
    super(new long[] {5, 0, 5}, new long[] {1, 5, 26});
  }
}
