package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254663 Numbers of n-length words on alphabet <code>{0,1,</code>...,7} with no subwords ii, where i is from <code>{0,1,</code>...,5}.
 * @author Sean A. Irvine
 */
public class A254663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254663() {
    super(new long[] {2, 7}, new long[] {1, 8});
  }
}
