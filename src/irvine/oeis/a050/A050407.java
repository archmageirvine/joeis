package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050407.
 * @author Sean A. Irvine
 */
public class A050407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050407() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 1, 1});
  }
}
