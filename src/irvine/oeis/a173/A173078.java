package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173078.
 * @author Sean A. Irvine
 */
public class A173078 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173078() {
    super(new long[] {-2, 1, 2}, new long[] {1, 3, 11});
  }
}
