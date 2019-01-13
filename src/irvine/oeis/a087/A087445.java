package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087445.
 * @author Sean A. Irvine
 */
public class A087445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087445() {
    super(new long[] {-1, 1, 1}, new long[] {1, 5, 13});
  }
}
