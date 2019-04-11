package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254658 Numbers of words on alphabet <code>{0,1,</code>...,7} with no subwords ii, where i is from <code>{0,1,2,3}</code>.
 * @author Sean A. Irvine
 */
public class A254658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254658() {
    super(new long[] {4, 7}, new long[] {1, 8});
  }
}
