package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280056 Number of <code>2 X 2</code> matrices with entries in <code>{0,1,...,n}</code> and even trace with no entries repeated.
 * @author Sean A. Irvine
 */
public class A280056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280056() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 0, 8, 48, 144, 360, 720});
  }
}
