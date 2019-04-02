package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094623 Sequence whose n-th term digits sum to n.
 * @author Sean A. Irvine
 */
public class A094623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094623() {
    super(new long[] {-10, 10, 1}, new long[] {0, 1, 11});
  }
}
