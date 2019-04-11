package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290902 p-INVERT of the positive integers, where p(S) <code>= 1 -</code> 3*S.
 * @author Sean A. Irvine
 */
public class A290902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290902() {
    super(new long[] {-1, 5}, new long[] {3, 15});
  }
}
