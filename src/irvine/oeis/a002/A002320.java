package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002320.
 * @author Sean A. Irvine
 */
public class A002320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002320() {
    super(new long[] {-1, 5}, new long[] {1, 3});
  }
}
