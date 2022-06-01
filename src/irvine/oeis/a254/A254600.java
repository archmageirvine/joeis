package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254600 Numbers of words on alphabet {0,1,...,10} with no subwords ii, for i from {0,1}.
 * @author Sean A. Irvine
 */
public class A254600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254600() {
    super(new long[] {9, 10}, new long[] {1, 11});
  }
}
