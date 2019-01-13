package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161852.
 * @author Sean A. Irvine
 */
public class A161852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161852() {
    super(new long[] {-1, 0, 16, 0}, new long[] {1, 5, 11, 79});
  }
}
