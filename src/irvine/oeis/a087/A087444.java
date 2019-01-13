package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087444.
 * @author Sean A. Irvine
 */
public class A087444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087444() {
    super(new long[] {-1, 1, 1}, new long[] {1, 4, 10});
  }
}
