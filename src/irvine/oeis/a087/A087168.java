package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087168.
 * @author Sean A. Irvine
 */
public class A087168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087168() {
    super(new long[] {-4, -3}, new long[] {1, -1});
  }
}
