package irvine.oeis.a007;

import irvine.oeis.LinearRecurrence;

/**
 * A007039.
 * @author Sean A. Irvine
 */
public class A007039 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007039() {
    super(new long[] {1, 0, -1, 2}, new long[] {2, 2, 2, 6});
  }
}

