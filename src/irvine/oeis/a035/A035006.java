package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035006.
 * @author Sean A. Irvine
 */
public class A035006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035006() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 8, 36, 96});
  }
}
