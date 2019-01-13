package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035174.
 * @author Sean A. Irvine
 */
public class A035174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035174() {
    super(new long[] {-2048, -24}, new long[] {1, -24});
  }
}
