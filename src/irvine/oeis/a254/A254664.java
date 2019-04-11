package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254664 Numbers of words on alphabet <code>{0,1,</code>...,8} with no subwords ii, where i is from <code>{0,1,</code>...,5}.
 * @author Sean A. Irvine
 */
public class A254664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254664() {
    super(new long[] {3, 8}, new long[] {1, 9});
  }
}
