package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137878 Perfect squares among 17-gonal numbers A051869(k) = k*(15*k - 13)/2.
 * @author Sean A. Irvine
 */
public class A137878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137878() {
    super(new long[] {1, -1, -232322, 232322, 1}, new long[] {1, 17689, 378225, 4109707449L, 87870152041L});
  }
}
