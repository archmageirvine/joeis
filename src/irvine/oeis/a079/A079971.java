package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079971.
 * @author Sean A. Irvine
 */
public class A079971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079971() {
    super(new long[] {1, 0, 0, 1, 1}, new long[] {1, 1, 2, 3, 5});
  }
}
