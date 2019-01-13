package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137878.
 * @author Sean A. Irvine
 */
public class A137878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137878() {
    super(new long[] {1, -1, -232322, 232322, 1}, new long[] {1, 17689, 378225, 4109707449L, 87870152041L});
  }
}
