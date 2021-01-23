package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254660 Numbers of words on alphabet {0,1,...,6} with no subwords ii, where i is from {0,1,...,4}.
 * @author Sean A. Irvine
 */
public class A254660 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254660() {
    super(new long[] {2, 6}, new long[] {1, 7});
  }
}
