package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228569 Binomial transform of A006497.
 * @author Sean A. Irvine
 */
public class A228569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228569() {
    super(new long[] {-3, 5}, new long[] {2, 5});
  }
}
