package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254662 Numbers of words on alphabet {0,1,...,7} with no subwords ii, where i is from {0,1,...,4}.
 * @author Sean A. Irvine
 */
public class A254662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254662() {
    super(new long[] {3, 7}, new long[] {1, 8});
  }
}
